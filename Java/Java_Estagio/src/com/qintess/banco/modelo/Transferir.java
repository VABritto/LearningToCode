package com.qintess.banco.modelo;

import java.util.List;
import java.util.Scanner;

public class Transferir {

	public void transferir(List<Conta> contas) {
		Scanner scanner = new Scanner(System.in);
		Transferencia transferencia = new Transferencia();

		System.out.print("Informe a agencia da conta transferidora: ");
		int agencia1 = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Informe o número da conta transferidora: ");
		int numero1 = scanner.nextInt();
		scanner.nextLine();

		Conta transferidora = contas.stream().filter(c -> c.getAgencia() == agencia1 && c.getNumero() == numero1)
				.findFirst().get();

		System.out.println("Nome: " + transferidora.getCliente().getNome() + "\nConta: " + agencia1 + "-" + numero1);

		System.out.print("Confirmar conta: (S/n) ");
		String opcao1 = scanner.nextLine();

		if (opcao1.equalsIgnoreCase("S")) {

			System.out.print("Informe a agencia da conta a transferir: ");
			int agencia2 = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Informe o número da conta a transferir: ");
			int numero2 = scanner.nextInt();
			scanner.nextLine();

			Conta transferida = contas.stream().filter(c -> c.getAgencia() == agencia2 && c.getNumero() == numero2)
					.findFirst().get();

			System.out.println("Nome: " + transferida.getCliente().getNome() + "\nConta: " + agencia2 + "-" + numero2);

			System.out.print("Confirmar conta: (S/n) ");
			String opcao2 = scanner.nextLine();

			if (opcao2.equalsIgnoreCase("S")) {
				System.out.print("Valor a transferir: ");
				double valor = scanner.nextDouble();
				transferencia.transferir(transferidora, transferida, valor);

				System.out.println("Valor transferido: R$" + valor);
			} else {
				System.out.println("Operação cancelada...");
			}
		} else {
			System.out.println("Operação cancelada...");
		}

	}
}
