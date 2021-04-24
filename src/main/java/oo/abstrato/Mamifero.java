package oo.abstrato;

public abstract class Mamifero extends Animal {

	@Override
	public String mover() {
		return "Usando as patas";
	}

	@Override
	public String respirar() {
		return "Respirando";
	}
	
	public abstract String mamar();
}
