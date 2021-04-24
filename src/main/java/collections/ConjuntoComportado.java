package collections;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		// Como est� usando HashSet ele n�o respeita a ordem de inser��o
		// TreeSet usa a ordena pela inser��o
		
//		Set<String> lista = new HashSet<String>(); // Minha lista obrigatoriamente so aceita String
		Set<String> lista = new TreeSet<String>(); // Minha lista obrigatoriamente so aceita String
		
		lista.add("Wesley");
		lista.add("Pedros");
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Jo�o");
		
		System.out.println(lista);
		
		for(String nome : lista) {
			System.out.println(nome);
		}
	}
	
}
