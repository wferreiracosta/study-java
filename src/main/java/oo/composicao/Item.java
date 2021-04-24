package oo.composicao;

public class Item {
	String nome;
	int quantidade;
	double preco;
	Compra compra;

	public Item() {
	}

	public Item(String nome, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}

	
}
