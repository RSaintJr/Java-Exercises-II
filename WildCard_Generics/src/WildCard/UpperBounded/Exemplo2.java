package WildCard.UpperBounded;

import java.util.List;

public class Exemplo2 {
    public static void EmitirSom(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.Som();
        }
    }
}
