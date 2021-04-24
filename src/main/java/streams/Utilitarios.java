package streams;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public interface Utilitarios {

    public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();

    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

    public final static Function<Integer, String> converterBinario = n -> Integer.toBinaryString(n);

    public final static UnaryOperator<String> reverterString = n -> new StringBuilder(n).reverse().toString();

    public final static Function<String, Integer> converterDecimal = n -> Integer.parseInt(n, 2);

    public final static Predicate<Aluno> bomComportamento = a -> a.bomComportamento == true;

    //    public final static UnaryOperator<String> grito = n -> n + "!!!";
    public static String grito(String n) {
        return n + "!!!";
    }

}
