package estrutura.repeticao;

public class For1 {
	public static void main(String[] args) {
		// For com quantidade determinada
		for (int i = 0; i <= 10; i++) {
			System.out.println("i = "+i);
		}
		
		int j = 0;
		for(; j<=10; j++) {
			System.out.println("j = "+j);
		}
		
		int k = 0;
		for(;k<=10;) {
			System.out.println("k = "+k);
			k++;
		}
	}
}
