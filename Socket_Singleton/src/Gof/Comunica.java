package Gof;

public class Comunica {

    private static Comunica com;

    private int codigo;
    private String msg;
    private boolean tipo;

    private Comunica(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public static Comunica getInstance(){
        if(com == null)
            com = new Comunica();
        return com;
    }

    @Override
    public String toString() {
        return "Gof.Comunica{" +
                "codigo=" + codigo +
                ", msg='" + msg + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
