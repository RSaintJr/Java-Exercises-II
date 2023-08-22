package Projeto.InjecaoDependente;

public class Agenda {

	private String nome;
	private String telefone;
	private String nascimento;
	private String email;

	public Agenda(String nome, String telefone, String nascimento, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
