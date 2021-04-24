package fundamentos;

import java.util.Date;

public class Import {
	public static void main(String[] args) {
		// Tudo dentro do java.lang já vem por padrão nas classes
		// Podemos ter classes com mesmos nomes mas com imports de pacotes diferentes. Ex: Date
		// Sempre ficar atento ao import utilizado
		
		String s = "Bom dia!";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
	}
}
