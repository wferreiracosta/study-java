package estrutura.controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a média: ");
		Double media = Double.parseDouble(entrada.nextLine());

		String mensagem = calcularResultado(media);
		System.out.println(mensagem);

		entrada.close();
	}

	private static String calcularResultado(Double media) {
		if (media > 10 || media < 0) {
			return "Média invalida!";
		}

		if (media >= 7) {
			return "Aprovado!";
		} else {
			return "Reprovado!";
		}
	}
}
