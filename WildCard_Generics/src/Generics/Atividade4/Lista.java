package Generics.Atividade4;

import java.util.ArrayList;
import java.util.List;

public class Lista <T>{

    private List<Chave> chave;

    public Lista() {
        this.chave = new ArrayList<>();
    }

    public boolean adicionar(String chave, T valor) {
        for (Chave chave2 : this.chave) {
            if (chave2.getChave().equals(chave)) {
                return false;
            }
        }
        this.chave.add(new Chave(chave, valor));
        return true;
    }

    public T buscar(String chave) {
        for (Chave chave2 : this.chave) {
            if (chave2.getChave().equals(chave)) {
                return (T) chave2.getValor();
            }
        }
        return null;
    }
}
