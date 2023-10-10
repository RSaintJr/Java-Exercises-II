package Generics.Atividade1;

public class Generic <T>{

    private T atributo;

    public Generic(T atributo) {
        this.atributo = atributo;
    }

    public T getAtributo() {
        return this.atributo;
    }

    public void setAtributo(T atributo) {
        this.atributo = atributo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Generic{");
        sb.append("atributo=").append(atributo);
        sb.append('}');
        return sb.toString();
    }
}
