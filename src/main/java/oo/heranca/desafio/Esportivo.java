package oo.heranca.desafio;

public interface Esportivo {

	void ligarTurbo();
	void desligarTurbo();
	
	/*Não será obrigado implementar porque ja possue um retorno padrão*/
	default int nivelDoAr() {
		return 1;
	}
}
