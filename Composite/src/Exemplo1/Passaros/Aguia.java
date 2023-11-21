package Exemplo1.Passaros;

public class Aguia extends aveDeRapina{
    @Override
    public void nome() {
        System.out.println("Águia");
    }

    @Override
    public void descricao() {
        System.out.println("A águia é o nome comum dado algumas aves de rapina da família Accipitridae," +
                " geralmente de grande porte, carnívoras, de grande acuidade visual.");
    }
}
