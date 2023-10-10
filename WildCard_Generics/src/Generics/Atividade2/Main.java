package Generics.Atividade2;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Produto<Integer> produto1 = new Produto<>(1, 100.0, Calendar.getInstance(), Calendar.getInstance());
        Produto<String> produto2 = new Produto<>("1", 200.0,Calendar.getInstance(), Calendar.getInstance());

        System.out.println("produto1: " + produto1);
        System.out.println("produto2: " + produto2);

    }
}
