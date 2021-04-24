package oo.composicao;

public class Carro {
	
	Motor motor = new Motor();
	
	void acelerar() {
		this.motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		this.motor.fatorInjecao -= 0.4;
	}
	
	void ligar() {
		this.motor.ligado = true;
	}

	void desligar() {
		this.motor.ligado = false;
	}
	
	boolean estaLigado() {
		return this.motor.ligado;
	}
	
}
