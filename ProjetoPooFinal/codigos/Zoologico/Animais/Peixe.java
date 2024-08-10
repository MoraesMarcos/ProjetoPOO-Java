package Zoologico.Animais;

public class Peixe extends Animal {

	private boolean escama;

	public Peixe() {
		// TODO Auto-generated constructor stub
	}

	public Peixe(boolean escama) {
		super();
		this.escama = escama;
	}

	public boolean isEscama() {
		return escama;
	}

	public void setEscama(boolean escama) {
		this.escama = escama;
	}
}
