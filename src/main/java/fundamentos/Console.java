package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!");
		System.out.println("Bom");
		System.out.println(" dia!");
		System.out.printf("Mega Sena: %d %d %d %d %d",1,2,3,4,5);
		System.out.printf("Nome: %s%n","João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite o sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Nome: "+nome+" "+sobrenome+" Idade: "+idade);
		
		entrada.close();
	}
}
