package generics;

import java.util.List;

public class ListaUtil {

    // List<?> -> Lista sem definição de tipo
    // List<Object> Lista que define o Object como tipo dos itens
    public static Object getUltimo1(List<?> lista){
        return lista.get(lista.size()-1);
    }

    public static <T> T getUltimo2(List<T> lista){
        return lista.get(lista.size()-1);
    }

    public static <A, B, C> C teste(A paramA, B paramB){
        C teste = null;
        return teste;
    }
}
