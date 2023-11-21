package Exemplo1;

import Exemplo1.Mamiferos.*;
import Exemplo1.Passaros.*;
import Exemplo1.repteis.*;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Zoo animais = new Zoo();
        animais.addAnimal(new Cachorro());
        animais.addAnimal(new Gato());
        animais.addAnimal(new Pombo());
        animais.addAnimal(new Aguia());
        animais.addAnimal(new Gavial());
        animais.addAnimal(new Tartaruga());

        Zoo familias = new Zoo();
        familias.addAnimal(new Felideo());
        familias.addAnimal(new Canideo());
        familias.addAnimal(new Crocodiliano());
        familias.addAnimal(new Testudines());
        familias.addAnimal(new aveUrbana());
        familias.addAnimal(new aveDeRapina());

        Zoo ordem = new Zoo();
        ordem.addAnimal(new Mamifero());
        ordem.addAnimal(new Passaro());
        ordem.addAnimal(new Reptil());

        zoo.addAnimal(animais);
        zoo.addAnimal(familias);
        zoo.addAnimal(ordem);


    }
}