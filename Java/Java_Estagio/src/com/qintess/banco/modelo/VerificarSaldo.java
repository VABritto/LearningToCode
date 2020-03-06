package com.qintess.banco.modelo;

import java.util.List;
import java.util.Scanner;

public class VerificarSaldo {

	public void verificarSaldo(List<Conta> contas) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a agencia do cliente: ");
		int agencia = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Informe o número da conta do cliente: ");
		int numero = scanner.nextInt();
		scanner.nextLine();

		Conta conta = contas.stream().filter(c -> c.getAgencia() == agencia && c.getNumero() == numero).findFirst()
				.get();
		double saldo = conta.getSaldo();
		String nome = conta.getCliente().getNome();
		System.out.printf("Conta: %d-%d\nNome: %s\nSaldo Atual: R$%.2f\n", agencia, numero, nome, saldo);

	}
}
