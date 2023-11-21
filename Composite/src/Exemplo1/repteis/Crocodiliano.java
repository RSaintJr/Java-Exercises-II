package Exemplo1.repteis;

public class Crocodiliano extends Reptil{

    @Override
    public void nome() {
        System.out.println("Crocodiliano");
    }

    @Override
    public void descricao() {
        System.out.println("A ordem crocodilia é uma ordem dos répteis que reúne todos os crocodilianos," +
                " representados principalmente pelos crocodilos, " +
                "jacarés e gaviais (encontrados na Índia) – animais que vivem em ambientes quentes e" +
                " habitam rios e lagos de água doce, sendo poucas espécies encontradas em água salgada.");
    }
}
