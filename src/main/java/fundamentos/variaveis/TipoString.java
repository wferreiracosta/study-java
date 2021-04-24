package fundamentos.variaveis;

public class TipoString {
	public static void main(String[] args) {
		// String é um objeto imutavel
		
		System.out.println("Olá, Mundo!!!".charAt(2));
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s+"!!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: "+nome+" Sobrneome: "+sobrenome+" Idade: "+idade+" Salario: "+salario);
		
		System.out.printf("Nome: %s %s tem %d e ganha %f", nome, sobrenome, idade, salario);
		
		String frase = String.format("Nome: %s %s tem %d e ganha %f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}
}
