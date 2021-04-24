package estrutura.controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma nota: ");
		double nota = entrada.nextDouble();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota invalida!");
		} else if (nota >= 8.1) {
			System.out.println("A");
		} else if (nota >= 6.1) {
			System.out.println("B");
		} else if (nota >= 4.1) {
			System.out.println("C");
		} else if (nota >= 2.1) {
			System.out.println("B");
		} else {
			System.out.println("E");
		}
		
		entrada.close();
	}
}
