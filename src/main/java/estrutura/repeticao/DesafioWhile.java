package estrutura.repeticao;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Double nota = 0D;
		Double total = 0.0D;
		Integer contador = 0;
		
		while (nota != -1) {
			System.out.print("Digite a nota: ");
			nota = entrada.nextDouble();
			if(nota <= 10 && nota >= 0) {
				total += nota;
				contador++;				
			}
		}
		
		System.out.println("Média: "+(total/contador));
		
		entrada.close();
	}
}
