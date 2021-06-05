package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTesteComGenerics {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        String ultimaLinguagem = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem);

        // <Integer> -> Informar o tipo do conteudo da lista que pode ser passado
        Integer ultimoNumero = ListaUtil.<Integer>getUltimo2(nums);
        System.out.println(ultimoNumero);
    }
}
