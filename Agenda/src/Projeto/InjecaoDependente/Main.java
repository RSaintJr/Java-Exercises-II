package Projeto.InjecaoDependente;

public class Main {

	public static void main(String[] args) {

		Agenda agenda = new Agenda("Rober2t","123456789","03/08/2999","robptolemy@gmail.com");

//		XML xml = new XML();
//		xml.salva(agenda);

//		JSON json = new JSON();
//		json.salva(agenda);

//		CSV csv = new CSV();
//		csv.salva(agenda);

		MySql sql = new MySql();
		sql.salva(agenda);
	}

}
