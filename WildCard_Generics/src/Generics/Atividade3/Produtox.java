package Generics.Atividade3;

public class Produtox <T>{

    private T id;
    private String nome;
    private double preco;

    public Produtox(T id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produtox{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }
}
