package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas você quer informar: ");
		int quantidadeNotas = entrada.nextInt();
		
		double [] notasAluno = new double[quantidadeNotas];
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.println("Informa a "+ (i+1) +"º nota :");
			notasAluno[i] = entrada.nextDouble();
		}
		
		double totalNota = 0;
		for(double nota : notasAluno) {
			totalNota += nota;			
		}
		
		System.out.println("Média do aluno: "+(totalNota/notasAluno.length));
		
		entrada.close();
	}
}
