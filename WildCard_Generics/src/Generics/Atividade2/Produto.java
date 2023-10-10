package Generics.Atividade2;

import java.util.Calendar;

public class Produto<T> {

    private T id;
    private double valor;
    private Calendar dataFabricacao;
    private Calendar dataVencimento;

    public Produto(T id, double valor, Calendar dataFabricacao, Calendar dataVencimento) {
        this.id = id;
        this.valor = valor;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Calendar getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Calendar dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Calendar getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("id=").append(id);
        sb.append(", valor=").append(valor);
        sb.append(", dataFabricacao=").append(dataFabricacao);
        sb.append(", dataVencimento=").append(dataVencimento);
        sb.append('}');
        return sb.toString();
    }
}
