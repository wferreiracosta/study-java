package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
//		O Var vai receber o tipo conforme o valor que est� sendo passado para ele
		var b = 4.5;
		System.out.println(b);
		
		var c = "String";
		System.out.println(c);
		
//		Mesmo usando o var n�o permitindo atribuir outro tipo, as variaveis do Java sempre ser�o de um tipo
//		c = 4.5;
	}
	
}
