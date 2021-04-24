package lambda;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		// So tem um metodo então vai usar ele no processo
		// Recebe dois double e retorna um
		Calculo calc = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calc.executar(1, 2));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(1, 2));
	}
}
