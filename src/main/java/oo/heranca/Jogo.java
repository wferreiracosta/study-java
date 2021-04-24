package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Jogador heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("Vida Monstro: "+monstro.vida);
		System.out.println("Vida Heroi: "+heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Vida Monstro: "+monstro.vida);
		System.out.println("Vida Heroi: "+heroi.vida);
	}
}
