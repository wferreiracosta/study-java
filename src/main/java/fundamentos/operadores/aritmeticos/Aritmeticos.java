package fundamentos.operadores.aritmeticos;

public class Aritmeticos {
	public static void main(String[] args) {
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b); // Adição
		System.out.println(a - b); // Subtração
		System.out.println(a * b); // Multiplicação
		System.out.println(a / b); // Divisão
		System.out.println(a / (double) b); // Divisão com casting
		System.out.println(a % b); // Resto Divisão
		
		System.out.println(a + b - x * y); // Calculo que vai usar a precedencia
		System.out.println((a + b) - (x * y));
		System.out.println((a + (b - x)) * y); // Forçando precedencia
	}
}
