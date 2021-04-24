package fundamentos.operadores.aritmeticos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		Double a = Math.pow((6 * (3+2)), 2) / (3*2);
		Double b = Math.pow(((1-5) * (2-7)/2),2);
		Double c = (a - b);
		Double d = Math.pow(c, 3) / Math.pow(10, 3);
		
		System.out.println(d);
		
		System.out.println("----------------------------");
		
		Integer numA = (int) Math.pow((6 * (3+2)), 2);
		Integer denA = 3 * 2;
		Integer superiorA = numA / denA;
		
		Integer numB = ((1-5) * (2-7));
		Integer denB = 2;
		Integer superiorB = (int) Math.pow((numB / denB), 2);
		
		Integer superior = (int) Math.pow(superiorA - superiorB, 3);
		Integer inferior = (int) Math.pow(10, 3);
		
		Integer resultado = superior / inferior;
		
		System.out.println("numA = (6 * (3+2))²");
		System.out.println("denA = 3 * 2");
		System.out.println("superiorA = numA / denA");
		
		System.out.println("numB = ((1-5) * (2-7))");
		System.out.println("denB = 2");
		System.out.println("superiorB = (numB / denB)²");
		
		System.out.println("superior = (superiorA - superiorB)³");
		System.out.println("inferior = 10³");
		System.out.println("resultado = superior / inferior");
		
		System.out.println("resultado = "+resultado);
	}
}
