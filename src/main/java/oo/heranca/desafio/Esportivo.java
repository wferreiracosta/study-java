package oo.heranca.desafio;

public interface Esportivo {

	void ligarTurbo();
	void desligarTurbo();
	
	/*N�o ser� obrigado implementar porque ja possue um retorno padr�o*/
	default int nivelDoAr() {
		return 1;
	}
}
