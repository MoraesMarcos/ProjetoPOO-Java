package Zoologico.Animais;

public class Ave extends Animal {

	private boolean migratoria;
	private boolean machucado;

	public Ave() {
		// TODO Auto-generated constructor stub
	}

	public Ave(boolean migratoria, boolean machucado) {
		super();
		this.migratoria = migratoria;
		this.machucado = machucado;
	}


	public boolean isMigratoria() {
		return migratoria;
	}

	public void setMigratoria(boolean migratoria) {
		this.migratoria = migratoria;
	}

	public boolean isMachucado() {
		return machucado;
	}

	public void setMachucado(boolean machucado) {
		this.machucado = machucado;
	}
}
