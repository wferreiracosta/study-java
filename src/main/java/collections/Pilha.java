package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>(); // LIFO -> Last In First Out
		livros.add("Livro A"); // Retorna true ou false
		livros.push("Livro B"); // Retorna nada, manda exception caso tenha restrição de capacidade
		livros.addFirst("Livros C");
		livros.addLast("Livros D");
		
		System.out.println(livros);
		
		System.out.println(livros.poll()); // Retorna e remover o primeiro e retorna null caso não ache
		System.out.println(livros.pop()); // Retorna e remover o primeiro e retorna exception caso não tenha
		
		System.out.println(livros);
		
		for(String livro : livros) {
			System.out.println(livro);
		}
		
		livros.forEach( livro -> System.out.println(livro));
	}
}
