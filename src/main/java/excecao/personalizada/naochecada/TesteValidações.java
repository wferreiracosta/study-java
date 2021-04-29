package excecao.personalizada.naochecada;

import streams.Aluno;

public class TesteValidações {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("ana", -7);;
        Validar.aluno(aluno);
    }
}
