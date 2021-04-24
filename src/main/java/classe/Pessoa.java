package classe;

public class Pessoa {
	String nome;
	double peso;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida comida) {
		this.peso += comida.peso;
	}
	
	String apresentar() {
		return String.format("%s Peso: %.2f \n", this.nome, this.peso);
	}
}
