package fundamentos.variaveis;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		
		System.out.println("Valor1: "+valor1);
		System.out.println("Valor2: "+valor2);
		
		System.out.println("Double");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		
		System.out.println("Double1: "+numero1);
		System.out.println("Double2: "+numero2);
		System.out.println("Soma: "+soma);
		System.out.println("Média: "+soma/2);
		
		System.out.println("BigDecimal");
		
		BigDecimal bigDecimal1 = new BigDecimal(valor1);
		BigDecimal bigDecimal2 = new BigDecimal(valor2);
		BigDecimal bigDecimaSoma = bigDecimal1.add(bigDecimal2);
		
		System.out.println("BigDecimal1: "+bigDecimal1);
		System.out.println("BigDecimal2: "+bigDecimal2);
		System.out.println("Soma BigDecimal: "+bigDecimaSoma);
		System.out.println("Média BigDecimal: "+bigDecimaSoma.divide(new BigDecimal(2)));
	}
}
