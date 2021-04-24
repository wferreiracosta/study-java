package oo.heranca.desafio;

public class Carro {
	
	private final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (this.velocidadeAtual + this.getDelta() > this.VELOCIDADE_MAXIMA) {
			this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
		} else {
			this.velocidadeAtual += this.getDelta();
		}
	}
	
	public void frear() {
		if (this.velocidadeAtual > 0) {
			this.velocidadeAtual -= this.getDelta();
		}
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}
