package Generics.Atividade4;

public class Chave <T>{

    private String chave;
    private T valor;

    public Chave(String chave, T valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public String getChave() {
        return this.chave;
    }

    public T getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Chave{");
        sb.append("chave='").append(chave).append('\'');
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
}
