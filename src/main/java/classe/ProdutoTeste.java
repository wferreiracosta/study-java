package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4356.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		Produto.desconto = 0.29;
		
		System.out.println("Produto: "+p1.nome+" Preço final: "+p1.precoComDesconto());
		
		System.out.println("Produto: "+p2.nome+" Preço final: "+p2.precoComDesconto());
	}
}
