package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o código da pessoa: ");
        int codigo = entrada.nextInt();

        String selectQuery = "SELECT * FROM pessoas WHERE codigo = ?";
        String updateQuery = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement preparedStatement = conexao.prepareStatement(selectQuery);
        preparedStatement.setInt(1, codigo);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            Pessoa pessoa = new Pessoa(resultSet.getInt(1), resultSet.getString(2));
            System.out.println("O nome atual é "+pessoa.getNome());
            entrada.nextLine();

            System.out.println("Informe o novo nome: ");
            String novoNome = entrada.nextLine();

            preparedStatement.close();
            preparedStatement = conexao.prepareStatement(updateQuery);
            preparedStatement.setString(1, novoNome);
            preparedStatement.setInt(2, codigo);
            preparedStatement.execute();

            System.out.println("Pesso Alterada com sucesso!");

        }

        conexao.close();
        entrada.close();
    }
}
