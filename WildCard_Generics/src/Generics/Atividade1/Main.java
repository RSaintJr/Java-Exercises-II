package Generics.Atividade1;

public class Main {

    public static void main(String[] args) {

        Banana b = new Banana("Prata", "Africa");
        Uva u = new Uva("Verde");
        Carro c = new Carro("Sedan");

        Generic<Banana> bananaGeneric = new Generic<>(b);
        Generic<Uva> uvaGeneric = new Generic<>(u);
        Generic<Carro> carroGeneric = new Generic<>(c);

        System.out.println(bananaGeneric);
        System.out.println(uvaGeneric);
        System.out.println(carroGeneric);
    }
}
