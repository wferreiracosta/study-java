package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    private Connection conexao;

    private Connection getConexao(){
        try {
            if(this.conexao != null && !conexao.isClosed()){
                return this.conexao;
            }
        } catch (SQLException e) { }
        this.conexao = FabricaConexao.getConexao();
        return this.conexao;
    }

    public int incluir(String sql, Object... objects){
        try {
            PreparedStatement preparedStatement = this.getConexao()
                    .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            this.adicionarAtributos(preparedStatement, objects);
            if(preparedStatement.executeUpdate() > 0){
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if(resultSet.next()){
                    return resultSet.getInt(1);
                }
            }
            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void adicionarAtributos(PreparedStatement preparedStatement, Object[] objects) throws SQLException {
        int indice = 1;
        for (Object object: objects){
            if(object instanceof String){
                preparedStatement.setString(indice, (String) object);
            } else if(object instanceof Integer){
                preparedStatement.setInt(indice, (Integer) object);
            }
            indice++;
        }
    }

    public void close(){
        try {
            this.getConexao().close();
        } catch (SQLException e) { } finally {
            this.conexao = null;
        }
    }

}
