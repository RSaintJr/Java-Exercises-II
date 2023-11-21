package Exemplo1.Passaros;

public class aveDeRapina extends Passaro{

    @Override
    public void nome() {
        System.out.println("Ave de Rapina");
    }

    public void descricao(){
        System.out.println("As aves denominadas “de rapina” são carnívoras" +
                " e possuem características próprias para a caça. " +
                "Basicamente, elas conseguem capturar facilmente" +
                " suas presas em meio à natureza.");
    }
}
