package lambda;

public class CalculoTeste {
	public static void main(String[] args) {
		Calculo soma = new Soma();
		Calculo multiplicar = new Multiplicar();
		
		System.out.println(soma.executar(1, 2));
		System.out.println(multiplicar.executar(1, 2));
	}
}
