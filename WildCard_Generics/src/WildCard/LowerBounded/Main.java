package WildCard.LowerBounded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Exemplo 1

        List<Integer> li = Arrays.asList(1, 2, 3);
        Exemplo1.mostrarLista(li);

        // Exemplo 2

        List<Animal> animais = new ArrayList<>();
        Exemplo2.adicionaGato(animais);
        System.out.println(animais.size());

        List<Gato> gatos = new ArrayList<>();
        Exemplo2.adicionaGato(gatos);
        System.out.println(gatos.size());
    }
}
