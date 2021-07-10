package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o código: ");
        int codigo = scanner.nextInt();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, codigo);

        if(preparedStatement.executeUpdate() > 0){
            System.out.println("Pessoa apagada do banco de dados!");
        } else {
            System.out.println("Nada feito!");
        }

        conexao.close();
        scanner.close();
    }
}
