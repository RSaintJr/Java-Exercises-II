package Generics.Atividade1;

public class Carro {

    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carro{");
        sb.append("modelo='").append(modelo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
