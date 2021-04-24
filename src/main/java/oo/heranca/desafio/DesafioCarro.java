package oo.heranca.desafio;

public class DesafioCarro {

	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari();
		Carro fusca = new Fusca();
		
		System.out.println("Ferrari valocidade atual >>>"+ferrari.velocidadeAtual);
		System.out.println("Fusca valocidade atual >>>"+fusca.velocidadeAtual);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frear();
		
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.frear();
		
		System.out.println("Ferrari valocidade atual >>>"+ferrari.velocidadeAtual);
		System.out.println("Fusca valocidade atual >>>"+fusca.velocidadeAtual);
	}
	
}
