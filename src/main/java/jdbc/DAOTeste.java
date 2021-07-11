package jdbc;

public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";

        dao.incluir(sql, "Joao Silva");
        dao.incluir(sql, "Carlos Santos");
        dao.incluir(sql, "Tiago Pereira");

        dao.close();
    }
}
