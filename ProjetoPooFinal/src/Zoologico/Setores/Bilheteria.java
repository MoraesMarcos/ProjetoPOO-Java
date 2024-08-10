package Zoologico.Setores;

import Zoologico.Pessoa.Visitante;

public class Bilheteria extends Setores {
	
	private Visitante visitante;
	
	public Bilheteria() {
		// TODO Auto-generated constructor stub
	}
	
	public Bilheteria(Visitante visitante) {
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
