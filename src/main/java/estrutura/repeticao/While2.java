package estrutura.repeticao;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String mensagem = "";
		
		while (!mensagem.equalsIgnoreCase("sair")) {
			System.out.print("Digite uma mensagem:" );
			mensagem = entrada.nextLine();
		}
		
		entrada.close();
	}

}
