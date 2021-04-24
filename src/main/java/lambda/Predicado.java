package lambda;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		/*
		Predicate faz um teste com a classe informada (Produto)
		e retorna um boolean
		*/
		Predicate<Produto> isCaro =
				prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto1 = new Produto("Celular", 700, 0);
		Produto produto2 = new Produto("Laptop", 3893.89, 0.85);
		Produto produto3 = new Produto("Monitor", 1000, 0);
		
		System.out.println(isCaro.test(produto1));
		System.out.println(isCaro.test(produto2));
		System.out.println(isCaro.test(produto3));
	}
}
