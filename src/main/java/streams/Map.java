package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        /* Map
        * Voc� possui um conjunto de elementos e eles ser�o processado conforme foram consumidos
        * Voc� vai definir uma fun��o para o Map e ele vai usar essa fun��o para transformar cada um dos elementos
        * Map vai gerar um Stream de mesmo tamanho com os dados modificados
        * */
        Consumer<String> print = System.out::println;
        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");
//        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println("\nUsando composi��o...");
        marcas.stream()
            .map(Utilitarios.maiuscula)
            .map(Utilitarios.primeiraLetra)
            .map(Utilitarios::grito)
            .forEach(print);
    }
}
