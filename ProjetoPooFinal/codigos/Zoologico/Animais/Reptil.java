package Zoologico.Animais;

public class Reptil extends Animal {

	private boolean veneno;

	public Reptil() {
		// TODO Auto-generated constructor stub
	}
	
	public Reptil(boolean veneno) {
		super();
		this.veneno = veneno;
	}


	public boolean isVeneno() {
		return veneno;
	}


	public void setVeneno(boolean veneno) {
		this.veneno = veneno;
	}
}