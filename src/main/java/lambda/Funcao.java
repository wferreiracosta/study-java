package lambda;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		// Você passa um valor (Integer) e obtem outro (String)
		Function<Integer, String> parOuImpar =
				numero -> numero % 2 == 0 ? "Par" : "Impar";

		Function<String, String> oResultadoE =
				valor -> "O Resultado é: "+valor;

		Function<String, String> empolgado =
				valor -> valor + "!";

		Function<String, String> duvida =
				valor -> valor + "?";

		String resultadoFinal = parOuImpar
				.andThen(empolgado)
				.andThen(oResultadoE)
				.apply(32);

		String resultadoFinal2 = parOuImpar
				.andThen(duvida)
				.andThen(oResultadoE)
				.apply(33);

		System.out.println(resultadoFinal);
		System.out.println(resultadoFinal2);
	}
}
