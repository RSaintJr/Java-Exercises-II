package Composite;

abstract class BaseFuncionario implements IFuncionario {
	
	public String nome;
    public String cargo;
    public double salario;
	
	
    public BaseFuncionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
	
	public String getNome() {
		return nome;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public double getSalario() {
		return salario;
	}
	
	/**
	 * Métodos
	 */
	
	public void aumentarSalario() {
	    double aumento = salario * 0.15;
	    salario += aumento;
	}
	
	public void definirNovoCargo(String novoCargo) {
	    this.cargo = novoCargo;
	}
	
	public String dadosDoFuncionario() {
		 StringBuilder builder = new StringBuilder();
		 builder.append("Nome: ").append(nome).append("\n");
		 builder.append("Cargo: ").append(cargo).append("\n");
		 builder.append("Salário: ").append(salario).append("\n");
		 return builder.toString();
	}
}
