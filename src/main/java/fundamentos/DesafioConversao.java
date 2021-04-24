package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		System.out.println("--------------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salario:");
		String primeiroSalario = entrada.next();
		
		System.out.print("Informe o segundo salario:");
		String segundoSalario = entrada.next();
		
		System.out.print("Informe o terceiro salario:");
		String terceiroSalario = entrada.next();
		
		Double salario1 = converterEmDouble(primeiroSalario);
		Double salario2 = converterEmDouble(segundoSalario);
		Double salario3 = converterEmDouble(terceiroSalario);
		
		Double somaSalario = (salario1+salario2+salario3);
		Double mediaSalario = somaSalario/3;
		
		System.out.println("--------------------------------");
		
		System.out.println("Soma: "+somaSalario);
		System.out.println("Média: "+mediaSalario);
		
		entrada.close();
	}

	private static double converterEmDouble(String salario) {
		return Double.parseDouble(salario.replace(",", "."));
	}
}
