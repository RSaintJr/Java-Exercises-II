package Generics.Atividade3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produtox> produtos;

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produtox produto) {
        this.produtos.add(produto);
    }

    public void mostrarProdutos() {
        for (Produtox produto : this.produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
}

