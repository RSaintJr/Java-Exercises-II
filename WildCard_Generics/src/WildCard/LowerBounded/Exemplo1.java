package WildCard.LowerBounded;

import java.util.List;

public class Exemplo1 {
    public static void mostrarLista(List<? super Integer> list){
        System.out.println(list);
    }
}
