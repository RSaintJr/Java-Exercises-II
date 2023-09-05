package Gof;

import Gof.Comunica;

public class Main {
    public static void main(String[] args) {
        Comunica com1 = Comunica.getInstance();
        Comunica com2 = Comunica.getInstance();
        Comunica com3 = Comunica.getInstance();

        com1.setCodigo(1);
        com2.setMsg("Teste");
        com3.setTipo(true);

        System.out.println(com1);
        System.out.println(com2);
        System.out.println(com3);
    }
}