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

		System.out.println("Tamanho � " + conjunto.size());

		conjunto.add("Teste"); // Como o "T" � maiusculo ele � diferente do anteiror
		conjunto.add("Teste"); // Como ele � igual ao anteiror n�o ser� incluido

		System.out.println("Tamanho � " + conjunto.size());

		// Retorna true se conseguiu remover
		System.out.println("Removeu? " + conjunto.remove("teste"));

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

//		conjunto.addAll(nums); // Uni�o entre dois conjuntos
		conjunto.retainAll(nums); // Faz a interce��o mantendo somente os valores em comum
		System.out.println(conjunto);
	}
	
}
