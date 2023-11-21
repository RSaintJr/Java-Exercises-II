package Exemplo1.repteis;

public class Gavial extends Crocodiliano{
    @Override
    public void nome() {
        System.out.println("Gavial");
    }

    @Override
    public void descricao() {
        System.out.println("A espécie difere dos demais crocodilianos pelo focinho estreito e alongado," +
                " e pela presença de uma protuberância nos machos adultos," +
                " caracterizando um dimorfismo sexual visível. " +
                "Outra característica única é a exteriorização dos dentes da metade anterior da maxila " +
                "e da mandíbula quando a boca do animal está fechada. Com registros de espécimes medindo até seis metros de comprimento," +
                " é uma das maiores espécies dentro da ordem Crocodylia.");
    }
}
