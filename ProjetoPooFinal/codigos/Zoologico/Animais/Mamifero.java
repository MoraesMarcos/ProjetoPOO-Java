package Zoologico.Animais;

public class Mamifero extends Animal {

	private String tipoDePelagem;
	private boolean machucado;

	public Mamifero() {
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String tipoDePelagem, boolean machucado) {
		super();
		this.tipoDePelagem = tipoDePelagem;
		this.machucado = machucado;
	}

	public String getTipoDePelagem() {
		return tipoDePelagem;
	}

	public void setTipoDePelagem(String tipoDePelagem) {
		this.tipoDePelagem = tipoDePelagem;
	}

    public void setMachucado(boolean machucado) {
        this.machucado = machucado;
    }

	public boolean isMachucado() {
		return machucado;
	}
}
