package excecao.personalizada.naochecada;

public class NumeroForaIntervaloException extends RuntimeException{
    private final String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está negativo", this.nomeDoAtributo);
    }
}
