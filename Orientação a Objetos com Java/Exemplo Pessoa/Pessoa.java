package model;

public class Pessoa {

	private String nome = "Luiz";

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String FalarNome() {
		return "Olá, meu nome é " + getNome() + ".";
	}

	public String Andar() {
		return "Andando...";
	}

}
