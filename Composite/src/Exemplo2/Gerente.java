package Composite;

import java.util.ArrayList;

public class Gerente extends BaseFuncionario {
    private final ArrayList<Lider> equipesGerenciadas;

    public Gerente(String nome, String cargo, double salario) {
        super(nome, cargo, salario);
        this.equipesGerenciadas = new ArrayList<>();
    }

    public void adicionarEquipe(Lider liderEquipe) {
        equipesGerenciadas.add(liderEquipe);
    }

    public void removerEquipe(Lider liderEquipe) {
        equipesGerenciadas.remove(liderEquipe);
    }

    public void exibirEquipes() {
        System.out.println("Equipes gerenciadas por " + getNome() + ":");
        for (Lider lider : equipesGerenciadas) {
            System.out.println("Equipe de " + lider.getNome());
            lider.exibirEquipe();
            System.out.println("==============");
        }
    }
}
