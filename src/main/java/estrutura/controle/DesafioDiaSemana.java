package estrutura.controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		// Domingo -> 1
		// Segunda -> 2
		// Terça -> 3
		// Quarta -> 4
		// Quinta -> 5
		// Sexta -> 6
		// Sabada -> 7
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia: ");
		String diaPalavra = entrada.nextLine();
		
		if (diaPalavra.equalsIgnoreCase("Domingo")) {
			System.out.println("Domingo -> 1");
		} else if (diaPalavra.equalsIgnoreCase("Segunda")) {
			System.out.println("Segunda -> 2");
		} else if (diaPalavra.equalsIgnoreCase("Terça")) {
			System.out.println("Terça -> 3");
		} else if (diaPalavra.equalsIgnoreCase("Quarta")) {
			System.out.println("Quarta -> 4");
		} else if (diaPalavra.equalsIgnoreCase("Quinta")) {
			System.out.println("Quinta -> 5");
		} else if (diaPalavra.equalsIgnoreCase("Sexta")) {
			System.out.println("Sexta -> 6");
		} else if (diaPalavra.equalsIgnoreCase("Sabado")) {
			System.out.println("Sabado -> 7");
		} else {
			System.out.println("Dia invalido!");
		}
		
		entrada.close();
	}
}
