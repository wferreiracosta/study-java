package excecao.personalizada.naochecada;

import streams.Aluno;

public class TesteValida��es {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("ana", -7);;
        Validar.aluno(aluno);
    }
}
