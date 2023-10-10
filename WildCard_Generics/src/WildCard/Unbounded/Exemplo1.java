package WildCard.Unbounded;

import java.util.List;

public class Exemplo1 {
    public static void MostrarLista(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
