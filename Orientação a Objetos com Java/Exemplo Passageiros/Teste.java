package model;

import java.util.*;

public class Teste extends Carro {

	public static void main(String[] args) {

		Carro passageiros = new Carro();

		try (Scanner scanf = new Scanner(System.in)) {
			System.out.print("Digite o número de passageiros iniciais: ");
			passageiros.setQnt_pessoas(scanf.nextInt());

			System.out.println("\n1) Adicionar passageiro(s) \n2) Remover passageiro(s)");
			System.out.print("Escolha uma opção: ");
			int op = scanf.nextInt();

			if (op == 1) {
				System.out.println("\nDeseja adicionar quantos passageiros? ");
				int pass = scanf.nextInt();
				System.out.println(passageiros.add_pessoa(passageiros.getQnt_pessoas(), pass));
			}

			else if (op == 2) {
				System.out.println("\nDeseja remover quantos passageiros? ");
				int pass = scanf.nextInt();
				System.out.println(passageiros.rem_pessoa(passageiros.getQnt_pessoas(), pass));
			}

			else {
				System.out.println("\nOpção inválida!");
			}
		}
	}
}
