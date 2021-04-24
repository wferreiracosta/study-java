package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data();
		data1.dia = 11;
		data1.mes = 05;
		data1.ano = 2001;
		
		Data data2 = new Data(03, 07, 1996);
		Data data3 = new Data();
		
//		System.out.println(data1.dia+"/"+data1.mes+"/"+data1.ano);
		System.out.println(data1.obterData());
		
//		System.out.printf("%d/%d/%d",data2.dia,data2.mes,data2.ano);
		System.out.println(data2.obterData());
		
		System.out.println(data3.obterData());
	}
}
