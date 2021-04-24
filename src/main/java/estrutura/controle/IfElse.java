package estrutura.controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		Integer numero = Integer.parseInt(valor);
		
		if ((numero % 2) == 1) {
			System.out.println("Número Ímpar!");
		} else {
			System.out.println("Número Par!");
		}
	}
}
