package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(2.3);

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(2);

    }
}
