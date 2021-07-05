package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao() {
        final String URL = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true";
        final String USUARIO = "root";
        final String SENHA = "password";
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
