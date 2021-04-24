package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "senhora");
		s = s.concat("!!!");
		s = s.toUpperCase();
		
		System.out.println(s);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
		// Tipos primitivos não tem o operador ponto "."
	}
}
