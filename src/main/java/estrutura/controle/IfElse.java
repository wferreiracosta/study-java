package estrutura.controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o n�mero: ");
		Integer numero = Integer.parseInt(valor);
		
		if ((numero % 2) == 1) {
			System.out.println("N�mero �mpar!");
		} else {
			System.out.println("N�mero Par!");
		}
	}
}
