package Generics.Atividade4;

public class Main {
    public static void main(String[] args) {

        Lista<Integer> lista = new Lista<>();

        System.out.println(lista.adicionar("chave1", 1));
        System.out.println(lista.adicionar("chave2", 2));
        System.out.println(lista.adicionar("chave1", 3));

        System.out.println(lista.buscar("chave1"));
        System.out.println(lista.buscar("chave2"));
        System.out.println(lista.buscar("chave3"));
    }
}
