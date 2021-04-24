package classe;

public class Data {
	Integer dia;
	Integer mes;
	Integer ano;
	
	public Data() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}
	
	public Data(Integer dia, Integer mes, Integer ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterData() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(dia+"/"+mes+"/"+ano);
	}
}
