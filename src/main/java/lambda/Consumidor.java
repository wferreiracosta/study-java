package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		/*
		Recebe parametro, executa o processo e não tem retorno
		*/
		Consumer<Produto> imprimir = produto -> System.out.println(produto.nome);
		
		Produto produto1 = new Produto("Celular", 700, 0);
		Produto produto2 = new Produto("Laptop", 3893.89, 0.85);
		Produto produto3 = new Produto("Monitor", 1000, 0);
		
		imprimir.accept(produto1);
		
		List<Produto> produtos = Arrays.asList(produto1, produto2, produto3);
		
//		produtos.forEach(produto -> imprimir.accept(produto));
		produtos.forEach(imprimir);
	}
}
