package oo.encapsulamento;

public class Pessoa {

	private int idade;

	public Pessoa() {
	}
	
	public Pessoa(int idade) {
		this.idade = idade;
	}

	// Getter -> Pegar
	public int getIdade() {
		return this.idade;
	}
	
	// Setter -> Colocar
	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;			
		}
	}
	
}
