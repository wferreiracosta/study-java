package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
//		O Var vai receber o tipo conforme o valor que está sendo passado para ele
		var b = 4.5;
		System.out.println(b);
		
		var c = "String";
		System.out.println(c);
		
//		Mesmo usando o var não permitindo atribuir outro tipo, as variaveis do Java sempre serão de um tipo
//		c = 4.5;
	}
	
}
