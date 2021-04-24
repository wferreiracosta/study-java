package fundamentos.operadores.atribuicao;

public class Atribuição {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b;
		c -= b;
		c *= b;
		c /= b;
		c %= b;
		
		System.out.println(c);
	}
}
