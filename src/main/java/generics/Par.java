package generics;

import java.util.Objects;

public class Par<C, V> {
    private C chave;
    private V valor;

    public Par() { }

    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return chave.equals(par.chave) && valor.equals(par.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chave, valor);
    }
}
