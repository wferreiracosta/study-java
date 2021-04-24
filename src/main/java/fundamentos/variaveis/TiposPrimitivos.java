package fundamentos.variaveis;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionario
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontos = 1_234_845_223; // Não precisa do L porque ainda está em um tamanho que o Int suporta
		long pontosAcumulados = 3_234_845_223L; // Como ultrapassou o tamanho do int é entendido como long então precisa do L
		
		// Tipos numéricos com ponto flutuante
		float salario = 11_445.44F; // Precisa do F porque o Java verifica o tipo é o padrão é double
		double vendasAcumuladas = 11_445.44;
		
		// Tipo Booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // So aceita uma letra
		char unicode = '\u0010'; // Representa uma letra na tabela unicode por isso funciona
		
		// Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		// Número de viagens
		System.out.println(numeroDeVoos/2);
		
		// Pontos por real
		System.out.println(pontos);
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha -> "+salario);
		System.out.println("Ferias? "+estaDeFerias);
		System.out.println("Status: "+status);
		System.out.println(unicode);
	}
}
