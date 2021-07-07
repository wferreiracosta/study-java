package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe parte do nome: ");
        String nome = entrada.nextLine();

        String sql = "SELECT * FROM pessoas WHERE nome like '%"+nome+"%'";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultSet.next()){
            pessoas.add(Pessoa.builder()
                    .codigo(resultSet.getInt("codigo"))
                    .nome(resultSet.getString("nome"))
                    .build());
        }

        pessoas.forEach(System.out::println);

        conexao.close();
        entrada.close();
    }
}
