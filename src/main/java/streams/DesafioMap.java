package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {
    public static void main(String[] args) {
        /*
        * 1. Número para String binário... 6 => "110"
        * 2. Reverter a String... "110" => "011"
        * 3. Converter de volta para inteiro => "011" => 3
        */

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        nums.stream()
            .map(Integer::toBinaryString)
            .map(Utilitarios.reverterString)
            .map(Utilitarios.converterDecimal)
            .forEach(System.out::println);
    }
}
