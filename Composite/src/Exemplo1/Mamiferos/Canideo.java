package Exemplo1.Mamiferos;

public class Canideo extends Mamifero{

    @Override
    public void nome() {
        System.out.println("Canideo");
    }

    @Override
    public void descricao() {
        System.out.println("Canidae é uma família de mamíferos da ordem Carnivora que engloba cães, lobos, chacais, coiotes e raposas." +
                " É composto por 36 espécies distribuídas por todos os continentes com exceção da Antártica.");
    }
}
