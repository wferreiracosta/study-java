package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        Consumer<Integer> println = System.out::println;

        System.out.println("1º Forma...");
        Stream<String> langs = Stream.of("Java", "Lua", "JS\n");
        langs.forEach(print);

        System.out.println("2º Forma...");
        String[] maisLangs = {"Python", "Lisp", "Pearl", "Go\n"};
        Stream.of(maisLangs).forEach(print);

        System.out.println("3º Forma...");
        Arrays.stream(maisLangs).forEach(print);

        System.out.println("4º Forma...");
        //Pegar do elemento 1 até o 2 sem incluir ele
        Arrays.stream(maisLangs, 1, 2).forEach(print);

        System.out.println("5º Forma...");
        List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

//        System.out.println("6º Forma...");
//        Stream.generate(() -> "a").forEach(print);
//        Stream.iterate(0, n-> n + 1).forEach(println);
    }
}
