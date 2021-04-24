package classe;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		fila.add("Wesley"); // Lan�a exceptio quando n�o cabe mais na fila quando tentar inserir
		fila.offer("Wendel"); // Retornar false quando tentar inserir e n�o couber na fila
		fila.offer("Alison");
		fila.offer("Victor");
		
		System.out.println(fila.peek()); // Le o primeiro elemento da fila e n�o remove, caso a fila esteja vazia retorna null
		System.out.println(fila.element()); // Le o primeiro elemento e n�o remove, retorna exception caso esteja vazia
		
		System.out.println(fila.poll()); // Retorna o primeiro elemento e remove ele, retorna false caso esteja vazia
		System.out.println(fila.remove()); // Retorna o primeiro elemento e remove, lan�a exce��o caso esteja vaiza
	}
}
