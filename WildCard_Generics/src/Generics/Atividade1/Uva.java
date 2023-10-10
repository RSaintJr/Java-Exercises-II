package Generics.Atividade1;

public class Uva {

    private String cor;

    public Uva(String cor) {
        setCor(cor);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Uva{");
        sb.append("cor='").append(cor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
