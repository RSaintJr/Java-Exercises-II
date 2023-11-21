package Exemplo1.Mamiferos;

public class Gato extends Felideo{

    @Override
    public void descricao() {
        System.out.println("O gato (nome científico: Felis silvestris catus) ou gato doméstico é um mamífero carnívoro da família dos felídeos" +
                " muito popular como animal de estimação.");
    }

    @Override
    public void nome() {
        System.out.println("Gato");
    }
}
