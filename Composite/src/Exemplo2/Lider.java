package Composite;

import java.util.ArrayList;

public class Lider extends Gerente {
    private final ArrayList<BaseFuncionario> equipe;

    public Lider(String nome, String cargo, double salario) {
        super(nome, cargo, salario);
        this.equipe = new ArrayList<>();
    }

    public void adicionarMembroEquipe(BaseFuncionario funcionario) {
        equipe.add(funcionario);
    }

    public void removerMembroEquipe(BaseFuncionario funcionario) {
        equipe.remove(funcionario);
    }

    public void exibirEquipe() {
        System.out.println("Membros da Equipe do Líder " + getNome() + ":");
        for (BaseFuncionario membro : equipe) {
            System.out.println(membro.dadosDoFuncionario());
            System.out.println();
        }
    }
}
