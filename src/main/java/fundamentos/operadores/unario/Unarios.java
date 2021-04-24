package fundamentos.operadores.unario;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1 // Postfix
		b--; // b = b + 1 // Postfix
		
		++a; // a = a + 1 // Prefix
		--b; // b = b + 1 // Prefix
		
		System.out.println(a);
		System.out.println(b);
	}
}
