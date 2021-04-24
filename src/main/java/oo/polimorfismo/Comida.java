package oo.polimorfismo;

/*Classe abstract � uma classe que n�o pode ser instanciada*/
public abstract class Comida {
	private double peso;

	public Comida(double peso) {
		this.setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}
}
