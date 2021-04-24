package oo.heranca;

public class Jogador {

	public int vida = 100;
	public int x;
	public int y;
	
	protected Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}

	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(this.x - oponente.x);
		int deltaY = Math.abs(this.y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			return true;
		}
		
		return true;
	}
	
	public boolean andar(Direcao direcao) {

		switch (direcao) {
			case NORTE:
				this.y--;
				break;
			case LESTE:
				this.x++;
				break;
			case SUL:
				this.y++;
				break;
			case OESTE:
				this.x--;
				break;
		}

		return true;
	}

}
