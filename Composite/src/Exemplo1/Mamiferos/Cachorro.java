package Exemplo1.Mamiferos;

public class Cachorro extends Canideo{

    @Override
    public void nome() {
        System.out.println("Cachorro");
    }

    @Override
    public void descricao() {
        System.out.println("O cão (nome científico: Canis lupus familiaris), " +
                "no Brasil também chamado de cachorro, é um mamífero carnívoro da família dos canídeos," +
                " subespécie do lobo, e talvez o mais antigo animal domesticado pelo ser humano.");
    }
}
