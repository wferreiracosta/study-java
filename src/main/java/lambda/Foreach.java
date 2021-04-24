package lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia");
		
		System.out.println("Forma tradicional...");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> {
			System.out.println(nome);
		});
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> System.out.println(nome));
		
		System.out.println("\nLambda #03...Method Reference");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #04...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nLambda #05...Method Reference");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é "+nome);
	}
}
