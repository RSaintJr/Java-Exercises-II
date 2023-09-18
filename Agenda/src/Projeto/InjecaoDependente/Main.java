package Projeto.InjecaoDependente;

public class Main {

	public static void main(String[] args) {

		Agenda agenda = new Agenda("Rober2t","123456789","03/08/2999","robptolemy@gmail.com");

		Salvar save = new XML();
		save.salva(agenda);

		save = new JSON();
		save.salva(agenda);

		save = new CSV();
		save.salva(agenda);

		save = new MySql();
		save.salva(agenda);
	}

}
