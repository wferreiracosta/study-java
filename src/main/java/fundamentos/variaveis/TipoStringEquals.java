package fundamentos.variaveis;

public class TipoStringEquals {
	public static void main(String[] args) {
		String s = new String("2");
		
		System.out.println("2" == "2");
		System.out.println(s == "2");
		System.out.println(s.equals("2"));
	}
}
