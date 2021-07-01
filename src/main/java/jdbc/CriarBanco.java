package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {
        final String URL = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        final String USUARIO = "root";
        final String SENHA = "password";

        Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

        Statement statement = conexao.createStatement();
        statement.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        conexao.close();
    }
}
