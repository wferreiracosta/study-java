package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {
    public static void main(String[] args) throws SQLException {
        List<Pessoa> pessoas = new ArrayList<>();

        Connection conexao = FabricaConexao.getConexao();

        String sql = "SELECT * FROM pessoas";

        Statement statement = conexao.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            pessoas.add(Pessoa.builder()
                    .codigo(resultSet.getInt("codigo"))
                    .nome(resultSet.getString("nome"))
                    .build());
        }

        pessoas.forEach(System.out::println);

        statement.close();
        conexao.close();
    }
}
