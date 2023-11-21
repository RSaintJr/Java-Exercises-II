package Exemplo1.repteis;

public class Tartaruga extends Testudines{
    @Override
    public void nome() {
        System.out.println("Tartaruga");
    }

    @Override
    public void descricao() {
        System.out.println("Passa a maior parte da sua vida em habitats marinhos e estuarinos," +
                " e as fêmeas só vêm à praia para desovar. O seu potencial de reprodução é extremamente baixo;" +
                " as fêmeas põem em média quatro ninhadas de ovos e posteriormente passam por um período de aquiescência" +
                " no qual não põem ovos durante dois ou três anos. ");
    }
}
