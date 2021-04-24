package estrutura.repeticao;

public class DesafioFor {
	public static void main(String[] args) {
//		String valor = "#";
//		String valorFinal = "#####";
		
//		Fazer esse for sem usar valor numerico
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}
		
//		for (int i = valor.length(); i <= valorFinal.length(); i++) {
//			System.out.println(valor);
//			valor += "#";
//		}
		
		for (String v = "#";  !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
