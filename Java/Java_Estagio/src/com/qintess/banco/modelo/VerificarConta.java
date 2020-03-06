package com.qintess.banco.modelo;

import java.util.List;
import java.util.Scanner;

public class VerificarConta {

	public void verificarConta(List<Conta> contas) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a agencia do cliente: ");
		int agencia = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Informe o número da conta do cliente: ");
		int numero = scanner.nextInt();
		scanner.nextLine();

		contas.stream().filter(conta -> conta.getAgencia() == agencia).filter(conta -> conta.getNumero() == numero)
				.forEach(conta -> conta.getConta());

	}
}
