package model;

public class Carro {

	private int qnt_pessoas;
	private int add_rem;

	public String add_pessoa(int qnt_pessoas, int add_rem) {
		return "\nEntrou " + add_rem + " passageiros, total = " + (qnt_pessoas + add_rem);
	}

	public String rem_pessoa(int qnt_pessoas, int add_rem) {
		return "\nSaiu " + add_rem + " passageiros, total = " + (qnt_pessoas - add_rem);
	}

	public int getQnt_pessoas() {
		return qnt_pessoas;
	}
	public void setQnt_pessoas(int qnt_pessoas) {
		this.qnt_pessoas = qnt_pessoas;
	}

	public int getAdd_rem() {
		return add_rem;
	}
	public void setAdd_rem(int add_rem) {
		this.add_rem = add_rem;
	}
}
