package WildCard.Unbounded;

import java.util.List;

public class Exemplo2{
    public static void EmitirSom(List<?> list) {
        for (Object obj : list) {
            if (obj instanceof Animal) {
                ((Animal) obj).Som();
            }
        }
    }
}
