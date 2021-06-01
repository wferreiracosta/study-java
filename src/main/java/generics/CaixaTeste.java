package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa();
        caixaA.guardar("Ola");
        System.out.println(caixaA.abrir());

        Caixa<Integer> caixaB = new Caixa();
        caixaB.guardar(123);
        System.out.println(caixaB.abrir());

        Caixa<Double> caixaC = new Caixa();
        caixaC.guardar(12.3);
        System.out.println(caixaC.abrir());
    }
}
