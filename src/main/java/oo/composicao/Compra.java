package oo.composicao;

import java.util.ArrayList;

public class Compra {
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	public void setItem(Item item){
		item.compra = this;
		this.itens.add(item);
	}
	
	public void setItem(String nome, int quantidade, double preco){
		Item item = new Item(nome, quantidade, preco);
		item.compra = this;
		this.itens.add(item);
	}
	
	public Double getValorTotal() {
		double total = 0.0;
		for(Item item : itens){
			total += item.quantidade * item.preco;
		}
		return total;
	}
}
