package classe;

public class Jantar {
	public static void main(String[] args) {
		Comida arroz = new Comida("Arroz", 0.180);
		Comida chocolate = new Comida("Chocolate", 0.300);
		
		Pessoa wesley = new Pessoa("Wesley", 99.8);
		
		System.out.printf(wesley.apresentar());
		
		System.out.printf("COMER %s %.2f \n", arroz.nome, arroz.peso);
		wesley.comer(arroz);
		System.out.printf(wesley.apresentar());
		
		System.out.printf("COMER %s %.2f \n", chocolate.nome, chocolate.peso);
		wesley.comer(chocolate);
		System.out.printf(wesley.apresentar());
	}
}
