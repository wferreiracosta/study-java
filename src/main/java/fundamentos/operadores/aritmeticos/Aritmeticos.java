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
		
		System.out.println(a + b); // Adi��o
		System.out.println(a - b); // Subtra��o
		System.out.println(a * b); // Multiplica��o
		System.out.println(a / b); // Divis�o
		System.out.println(a / (double) b); // Divis�o com casting
		System.out.println(a % b); // Resto Divis�o
		
		System.out.println(a + b - x * y); // Calculo que vai usar a precedencia
		System.out.println((a + b) - (x * y));
		System.out.println((a + (b - x)) * y); // For�ando precedencia
	}
}
