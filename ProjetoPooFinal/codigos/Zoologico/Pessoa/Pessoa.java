package Zoologico.Pessoa;

public class Pessoa {
	private String nome;
	private String idade;
	private String email;
	private String genero;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
		
	}

	public Pessoa(String nome, String idade, String email, String genero) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
		
}

