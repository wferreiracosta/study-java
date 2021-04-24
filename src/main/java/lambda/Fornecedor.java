package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        //Não passa parametro e recebe um retorno
        Supplier<List<String>> umLista =
                () -> Arrays.asList("Ana","Bia","Lia");

        System.out.println(umLista.get());
    }
}
