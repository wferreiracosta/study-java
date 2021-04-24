package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        //Representa uma operação sobre dois operandos do mesmo tipo, produzindo um resultado do mesmo tipo que os operandos.
        BinaryOperator<Double> media =
                (Double n1, Double n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8, 5.7));

        //Representa uma função que aceita dois argumentos e produz um resultado.
        // 1º Tipo Primeiro argumento (Double)
        // 2º Tipo Segundo argumento (Double)
        // 3º Tipo Resultado (String)
//        BiFunction<Double, Double, String> resultado =
//                (n1, n2) -> ((n1 + n2) /2) >= 7 ? "Aprovado" : "Reprovado";

        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
          double notaFinal = (n1 + n2) / 2;
          return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(9.7, 5.1));

        Function<Double, String> conceito = m -> {
            return m >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(media.andThen(conceito).apply(9.7, 4.1));
    }
}
