package model;

public class Exemplo {
	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();

		System.out.println(pessoa.FalarNome());
		System.out.println(pessoa.Andar());

		// OU

		// System.out.printf(pessoa.FalarNome()+ "\n" +pessoa.Andar());

	}
}
