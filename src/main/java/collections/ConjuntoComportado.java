package collections;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		// Como está usando HashSet ele não respeita a ordem de inserção
		// TreeSet usa a ordena pela inserção
		
//		Set<String> lista = new HashSet<String>(); // Minha lista obrigatoriamente so aceita String
		Set<String> lista = new TreeSet<String>(); // Minha lista obrigatoriamente so aceita String
		
		lista.add("Wesley");
		lista.add("Pedros");
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("João");
		
		System.out.println(lista);
		
		for(String nome : lista) {
			System.out.println(nome);
		}
	}
	
}
