package fundamentos.operadores.logicos;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		
		System.out.println("------------------------------");
		
		System.out.println(!condicao1 + " | " + condicao1);
		System.out.println(!condicao2 + " | " + condicao2);
		
		System.out.println("------------------------------");
		
		System.out.println("Tabela verdade E (AND)(&&)");
		System.out.println("TRUE && FALSE -> "+(true&&false));
		System.out.println("TRUE && TRUE -> "+(true&&true));
//		System.out.println("FALSE && TRUE -> "+(false&&false));
//		System.out.println("FALSE && FALSE -> "+(false&&false));
		
		System.out.println("------------------------------");
		
		System.out.println("Tabela verdade OU (OUR)(||)");
//		System.out.println("TRUE || FALSE -> "+(true||false));
//		System.out.println("TRUE || TRUE -> "+(true||true));
		System.out.println("FALSE || TRUE -> "+(false||false));
		System.out.println("FALSE || FALSE -> "+(false||false));
		
		System.out.println("------------------------------");
		
		System.out.println("Tabela verdade OU EXCLUSIVO (XOR)(^)");
		System.out.println("TRUE ^ FALSE -> "+(true^false));
		System.out.println("TRUE ^ TRUE -> "+(true^true));
		System.out.println("FALSE ^ TRUE -> "+(false^false));
		System.out.println("FALSE ^ FALSE -> "+(false^false));
		
		System.out.println("------------------------------");
		
		System.out.println("Tabela verdade NEGAÇÃO (NOT)(!)");
		System.out.println("!TRUE -> "+!true);
		System.out.println("!FALSE -> "+!false);
	}
}
