package WildCard.Unbounded;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // Exemplo 1

        List<Integer> inteiros = Arrays.asList(1, 2, 3);
        Exemplo1.MostrarLista(inteiros);

        List<String> StrLista = Arrays.asList("Coelho", "Vaca", "Cervo");
        Exemplo1.MostrarLista(StrLista);

        // Exemplo 2

        List<Cachorro> cachorros = Arrays.asList(new Cachorro(), new Cachorro());
        Exemplo2.EmitirSom(cachorros);

        List<Gato> gatos = Arrays.asList(new Gato(), new Gato());
        Exemplo2.EmitirSom(gatos);
    }
}
