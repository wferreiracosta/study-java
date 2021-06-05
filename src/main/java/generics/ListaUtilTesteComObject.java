package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTesteComObject {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem);

        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero);
    }
}
