package jdbc;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

    public static Connection getConexao() {
        try {
            Properties properties = getProperties();

            final String URL = properties.getProperty("banco.url");
            final String USUARIO = properties.getProperty("banco.usuario");
            final String SENHA = properties.getProperty("banco.senha");

            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {
        Properties properties = new Properties();
        String caminho = "/src/main/resources/conexao.properties";
        properties.load(FabricaConexao.class.getResourceAsStream(caminho));
        return properties;
    }

}
