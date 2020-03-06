package com.qintess.banco.modelo;

import java.util.List;
import java.util.Scanner;

public class NovaConta {

	public void novaConta(List<Conta> contas) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome do cliente: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o CPF do cliente (só números): ");
		long cpf = scanner.nextLong();
		scanner.nextLine(); // Só para limpar a linha do nextInt.
		System.out.print("Digite o Estado Civil do cliente: ");
		String estadoCivil = scanner.nextLine();
		System.out.print("Digite o idade do cliente: ");
		int idade = scanner.nextInt();
		scanner.nextLine(); // Só para limpar a linhar do nextInt.
		System.out.print("Digite o endereço do cliente: ");
		String endereco = scanner.nextLine();
		System.out.print("Digite o nova senha do cliente: ");
		String senha1 = scanner.nextLine();
		System.out.print("Digite novamente a senha: ");
		String senha2 = scanner.nextLine();
		VerificarSenha verificador = new VerificarSenha();
		while (!verificador.verificarSenha(senha1, senha2)) {
			System.out.println("Senha incorreta...");

			System.out.print("Digite o nova senha do cliente: ");
			senha1 = scanner.nextLine();
			System.out.print("Digite novamente a senha: ");
			senha2 = scanner.nextLine();
		}

		String senha = senha1;

		Cliente cliente = new Cliente(nome, cpf, senha, estadoCivil, idade, endereco);

		System.out.print("Digite o número da agencia do cliente: ");
		int agencia = scanner.nextInt();
		System.out.print("Digite o número da conta do cliente: ");
		int numero = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Digite o saldo inicial do cliente: ");
		double saldoInicial = scanner.nextDouble();
		scanner.nextLine();
		Conta conta = new Conta(agencia, numero, saldoInicial, cliente);

		conta.getConta();
		System.out.print("Todas as informações estão corretas? (S/n) ");
		String opcao = scanner.nextLine();
		if (opcao.equalsIgnoreCase("S")) {
			contas.add(conta);
			System.out.println("Conta registrada.");
		} else {
			System.out.println("Registro cancelado.");
		}

	}
}
