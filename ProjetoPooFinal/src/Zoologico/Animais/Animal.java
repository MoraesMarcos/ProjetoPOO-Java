package Zoologico.Animais;

public class Animal {
	private String tipo;
	private String sexo;
	private String idade;
	private String habitat;
	private String curiosidade;
	private String alimentacao;



	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String tipo, String sexo, String idade, String habitat, String curiosidade, String alimentacao) {
		super();
		this.tipo = tipo;
		this.sexo = sexo;
		this.idade = idade;
		this.habitat = habitat;
		this.curiosidade = curiosidade;
		this.alimentacao = alimentacao;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;

	}

	public String getHabitat() {
		return habitat;
	}

	public String getCuriosidade() {
		return curiosidade;
	}

	public void setCuriosidade(String curiosidade) {
		this.curiosidade = curiosidade;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isMachucado() {
		// TODO Auto-generated method stub
		return false;
	}
}
