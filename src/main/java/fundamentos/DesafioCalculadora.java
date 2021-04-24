package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		
		System.out.println("--------------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero:");
		Double num1 = entrada.nextDouble();
		
		System.out.print("Informe o segundo numero:");
		Double num2 = entrada.nextDouble();
		
		System.out.print("Informe a operação:");
		String operacao = entrada.next();
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		
		System.out.printf("Resultado: %.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		entrada.close();
	}
}
