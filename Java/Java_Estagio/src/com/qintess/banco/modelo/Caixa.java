package com.qintess.banco.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Caixa {

	public static List<Conta> contas = new ArrayList<Conta>();
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		painelDeControle();
		scanner.close();
	
	}
	
	public static void painelDeControle() {

		System.out.print("1- Criar nova conta\n2- Verificar conta \n3- Verificar saldo"
				+ "\n4- Depositar \n5- Sacar\n6- Transferir para outra conta local\n7- Sair\n\n"
				+ "Qual ação deseja tomar? (1/2/3/4/5/6/7) ");
		int decisao = scanner.nextInt();
		scanner.nextLine();
		String opcao = "S";

		switch (decisao) {
		case 1: {
			while (!opcao.equalsIgnoreCase("n")) {
				novaConta();

				System.out.print("Deseja criar uma nova conta? (S/n): ");
				opcao = scanner.nextLine();
			}

			painelDeControle();
			break;
		}
		case 2: {
			while (!opcao.equalsIgnoreCase("n")) {
				verificarConta();
				System.out.print("Deseja verificar outra conta? (S/n): ");
				opcao = scanner.nextLine();
			}

			painelDeControle();
			break;
		}
		case 3: {
			while (!opcao.equalsIgnoreCase("n")) {
				verificarSaldo();
				System.out.print("Deseja verificar o saldo de outra conta? (S/n): ");
				opcao = scanner.nextLine();
			}

			painelDeControle();
			break;
		}
		case 4: {
			while (!opcao.equalsIgnoreCase("n")) {
				depositar();
				System.out.print("Deseja realizar outro depósito? (S/n): ");
				opcao = scanner.nextLine();
			}

			painelDeControle();
			break;
		}
		case 5: {
			while (!opcao.equalsIgnoreCase("n")) {
				sacar();
				System.out.print("Deseja sacar outro valor? (S/n): ");
				opcao = scanner.nextLine();
			}

			painelDeControle();
			break;
		}
		case 6: {
			while (!opcao.equalsIgnoreCase("n")) {
				transferir();
				System.out.print("Deseja transferir outro valor? (S/n): ");
				opcao = scanner.nextLine();
			}

			painelDeControle();
			break;
		}
		default:
			System.out.println("Saindo do programa...");
		}

	}
	
	public static void novaConta() {

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
	
	public static void depositar() {
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

		double valor = scanner.nextDouble(); scanner.nextLine();
		System.out.println("Valor depositado: R$" + valor);
		conta.depositar(valor);
	}

	public static void sacar() {
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
		double valor = scanner.nextDouble(); scanner.nextLine();
		
		if (valor > 300) {
			System.out.println("Valor inválido, cancelando transação...");
		} else if (valor <= 300 && valor > 0) {
			conta.sacar(valor);
			System.out.println("Valor sacado: R$" + valor);
		} else {
			System.out.println("Valor inválido, cancelando transação...");
		}
	}
	
	public static void transferir() {
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
				double valor = scanner.nextDouble(); scanner.nextLine();
				transferencia.transferir(transferidora, transferida, valor);

				System.out.println("Valor transferido: R$" + valor);
			} else {
				System.out.println("Operação cancelada...");
			}
		} else {
			System.out.println("Operação cancelada...");
		}
	}
	
	public static void verificarConta() {
		System.out.print("Informe a agencia do cliente: ");
		int agencia = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Informe o número da conta do cliente: ");
		int numero = scanner.nextInt();
		scanner.nextLine();

		contas.stream().filter(conta -> conta.getAgencia() == agencia).filter(conta -> conta.getNumero() == numero)
				.forEach(conta -> conta.getConta());

	}
	
	public static void verificarSaldo() {
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
