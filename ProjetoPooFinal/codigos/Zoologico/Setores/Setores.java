package Zoologico.Setores;

import java.util.List;

import Zoologico.Pessoa.Funcionario;

public class Setores {
	
	private List<Funcionario> funcionario;


	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public Setores() {
		// TODO Auto-generated constructor stub
	}


	public Setores(List<Funcionario> funcionario) {
		super();
		this.funcionario = funcionario;
	}

}
