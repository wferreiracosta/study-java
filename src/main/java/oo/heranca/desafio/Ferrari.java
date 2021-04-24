package oo.heranca.desafio;

/*
implements -> Vai implementar todos os metodos da interface 
*/
public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari() {
		super(115);
		super.setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		super.setDelta(35);
		this.ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		super.setDelta(35);
		this.ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		this.ligarAr = true;
	}

	@Override
	public void desligarAr() {
		this.ligarAr = false;
	}

	@Override
	public int getDelta() {
		if (this.ligarTurbo && this.ligarAr) {
			return 35;
		} else if (this.ligarAr && this.ligarTurbo) {
			return 30;
		} else if (!this.ligarTurbo && !this.ligarAr) {
			return 20;
		}
		return 15;
	}

}
