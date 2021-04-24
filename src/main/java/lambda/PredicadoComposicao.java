package lambda;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        // Recebe um valor (Integer) e retorna um boolean
        Predicate<Integer> isPar = numero -> numero % 2 == 0;
        Predicate<Integer> isTresDigitos = numero -> numero >= 100 && numero <= 999;

        System.out.println(isPar.test(22));
        System.out.println(isTresDigitos.test(22));
        System.out.println(isTresDigitos.test(222));

        // negate() -> negação logica
        System.out.println(isPar.and(isTresDigitos).negate().test(23));
    }
}
