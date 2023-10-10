package WildCard.LowerBounded;

import java.util.List;

public class Exemplo2 {
    public static void adicionaGato(List<? super Gato> list) {
        list.add(new Gato());
    }
}
