package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; // atribuição por valor
		aumentar(a);
		
		a++;
		b--;
		
		System.out.println(a + " : " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referencia
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		retornarData(d1);
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
	}
	
	static void retornarData(Data d) {
		d.dia = 1;
	}
	
	static void aumentar(double a) {
		a++;
	}
}
