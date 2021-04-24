package streams;

import lambda.Predicado;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8, true);
        Aluno a2 = new Aluno("Bia", 5.8, false);
        Aluno a3 = new Aluno("Daniel", 9.8, true);
        Aluno a4 = new Aluno("Gui", 6.8, false);
        Aluno a5 = new Aluno("Rebeca", 7.1, true);
        Aluno a6 = new Aluno("Pedro", 8.8, false);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        System.out.println("Usando foreach");

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> saudacaoAprovado =
                a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";

        alunos.stream()
                .filter(aprovado)
                .filter(Utilitarios.bomComportamento)
                .map(saudacaoAprovado)
                .forEach(System.out::println);

        System.out.println("Salvando em variavel");
        List<Aluno> alunosAprovados = alunos.stream()
                .filter(aluno -> aluno.nota >= 7)
                .collect(Collectors.toList());

    }
}
