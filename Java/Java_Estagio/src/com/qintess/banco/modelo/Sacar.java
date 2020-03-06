package com.qintess.banco.modelo;

import java.util.List;
import java.util.Scanner;

public class Sacar {

	public void sacer(List<Conta> contas) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a agencia do cliente: ");
		int agencia = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Informe o número da conta do cliente: ");
		int numero = scanner.nextInt();
		scanner.nextLine();

		Conta conta = contas.stream().filter(c -> c.getAgencia() == agencia && c.getNumero() == numero).findFirst()
				.get();

		System.out.println("Nome: " + conta.getCliente().getNome());
		System.out.print("Valor a sacar: (limite de R$300) ");
		double valor = scanner.nextDouble();

		if (valor > 300) {
			System.out.println("Valor inválido, cancelando transação...");
		} else if (valor <= 300 && valor > 0) {
			conta.sacar(valor);
			System.out.println("Valor sacado: R$" + valor);
		} else {
			System.out.println("Valor inválido, cancelando transação...");
		}

	}
}
