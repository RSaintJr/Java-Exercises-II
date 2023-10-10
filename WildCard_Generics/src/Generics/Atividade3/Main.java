package Generics.Atividade3;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        Produtox produto1 = new Produtox("1", "Produto 1", 25);
        Produtox produto2 = new Produtox(2, "Produto 2", 50);
        Produtox produto3 = new Produtox(3, "Produto 3", 100);

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        pedido.mostrarProdutos();

    }
}
