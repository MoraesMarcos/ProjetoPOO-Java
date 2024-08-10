package Zoologico.Setores;

import Zoologico.Pessoa.Visitante;

public class Restaurante extends Setores {

	private Visitante visitante;

	public Restaurante() {
		// TODO Auto-generated constructor stub
	}

	public Restaurante(Visitante visitante) {
		super();
		this.visitante = visitante;
	}

	public Visitante getVisitante() {
		return visitante;
	}


	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}
}