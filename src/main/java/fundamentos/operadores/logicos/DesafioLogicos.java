package fundamentos.operadores.logicos;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = true;
		
		boolean comprarTv50 = trabalhoQuinta && trabalhoTerca;
		boolean comprarTv32 = trabalhoQuinta ^ trabalhoTerca;
		boolean tomarSorvete = trabalhoQuinta || trabalhoTerca;
		
		System.out.println("Trabalho de Terça: " + trabalhoTerca);
		System.out.println("Trabalho de Quinta: " + trabalhoQuinta);
		
		System.out.println("Comprar TV de 50\"? " + comprarTv50);
		System.out.println("Comprar TV de 32\"? " + comprarTv32);
		System.out.println("Vamos tomar sorvete? " + tomarSorvete);
	}
}
