package Zoologico.Pessoa;

public class Funcionario extends Pessoa {
	
	private String cargo;
	

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String cargo) {
		super();
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	
}
