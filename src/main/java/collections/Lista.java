package collections;

import java.util.ArrayList;

import classe.Usuario;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1); // indice -> 0
		
		lista.add(new Usuario("Carlos")); // indice -> 1
		lista.add(new Usuario("Lia")); // indice -> 2
		lista.add(new Usuario("Bia")); // indice -> 3
		lista.add(new Usuario("Manu")); // indice -> 4
		
		System.out.println(lista.get(3)); // Busca o valor no indice 3
		
		lista.remove(2); // Remover atraves do indice
		lista.remove(new Usuario("Manu")); // Removendo informando objeto, ele usa o equals e hashcode para verificar se são iguais
		
		Boolean existe = lista.contains(new Usuario("Bia")); // Verifica se o objeto está presente, usa o equals e hashcode para verifica se é igual
		System.out.println(existe);
		
		for(Usuario u : lista) {
			System.out.println(u.nome);
		}
	}
}
