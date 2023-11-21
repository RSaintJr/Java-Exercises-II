package Exemplo1.Mamiferos;

public class Felideo extends Mamifero{

    @Override
    public void nome() {
        System.out.println("Felideo");
    }

    @Override
    public void descricao() {
        System.out.println("Felídeos (latim científico: Felidae) são uma família de animais mamíferos digitígrados," +
                " da ordem dos carnívoros. Existem muitas espécies selvagens, como os grandes felinos."
                +
                "Existem duas subfamílias de felídeos: Pantherinae (que inclui tigres, leões, onças-pintadas, leopardo-das-neves e leopardos)" +
                " e felíneos (que inclui guepardos, suçuaranas, linces, jaguatiricas e gatos domésticos).");
    }
}
