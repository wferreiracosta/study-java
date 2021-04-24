package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // Vai converter de forma automatica double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("Tamanho é " + conjunto.size());

		conjunto.add("Teste"); // Como o "T" é maiusculo ele é diferente do anteiror
		conjunto.add("Teste"); // Como ele é igual ao anteiror não será incluido

		System.out.println("Tamanho é " + conjunto.size());

		// Retorna true se conseguiu remover
		System.out.println("Removeu? " + conjunto.remove("teste"));

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

//		conjunto.addAll(nums); // União entre dois conjuntos
		conjunto.retainAll(nums); // Faz a interceção mantendo somente os valores em comum
		System.out.println(conjunto);
	}
	
}
