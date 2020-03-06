package com.qintess.banco.modelo;

import java.util.List;
import java.util.Scanner;

public class Depositar {

	public void depositar(List<Conta> contas) {
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
		System.out.print("Valor a depositar: ");

		double valor = scanner.nextDouble();
		System.out.println("Valor depositado: R$" + valor);
		conta.depositar(valor);
	}
}