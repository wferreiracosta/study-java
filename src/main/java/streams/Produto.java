package streams;

public class Produto {
    public final String nome;
    public final double preco;
    public final double desconto;
    public final double valorFrete;

    public Produto(String nome, double preco, double desconto, double valorFrete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.valorFrete = valorFrete;
    }
}
