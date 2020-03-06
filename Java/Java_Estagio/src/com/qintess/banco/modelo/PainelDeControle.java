package com.qintess.banco.modelo;

import java.util.List;
import java.util.Scanner;

public class PainelDeControle {

	public void painelDeControle(List<Conta> contas) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("1- Criar nova conta\n2- Verificar conta \n3- Verificar saldo"
				+ "\n4- Depositar \n5- Sacar\n6- Transferir para outra conta local\n7- Sair\n\n"
				+ "Qual ação deseja tomar? (1/2/3/4/5/6/7) ");
		int decisao = scanner.nextInt();
		scanner.nextLine();
		String opcao = "S";

		switch (decisao) {
		case 1: {
			while (!opcao.equalsIgnoreCase("n")) {
				NovaConta novaConta = new NovaConta();
				novaConta.novaConta(contas);

				System.out.print("Deseja criar uma nova conta? (S/n): ");
				opcao = scanner.nextLine();
			}

			painelDeControle(contas);
			break;
		}
		case 2: {
			while (!opcao.equalsIgnoreCase("n")) {
				VerificarConta verificador = new VerificarConta();
				verificador.verificarConta(contas);
				System.out.print("Deseja verificar outra conta? (S/n): ");
				opcao = scanner.nextLine();
			}

			painelDeControle(contas);
			break;
		}
		case 3: {
			while (!opcao.equalsIgnoreCase("n")) {
				VerificarSaldo verificador = new VerificarSaldo();
				verificador.verificarSaldo(contas);
				System.out.print("Deseja verificar o saldo de outra conta? (S/n): ");
				opcao = scanner.nextLine();
			}

			painelDeControle(contas);
			break;
		}
		case 4: {
			while (!opcao.equalsIgnoreCase("n")) {
				Depositar depositar = new Depositar();
				depositar.depositar(contas);
				System.out.print("Deseja realizar outro depósito? (S/n): ");
				opcao = scanner.nextLine();
			}

			painelDeControle(contas);
			break;
		}
		case 5: {
			while (!opcao.equalsIgnoreCase("n")) {
				Sacar sacar = new Sacar();
				sacar.sacer(contas);
				System.out.print("Deseja sacar outro valor? (S/n): ");
				opcao = scanner.nextLine();
			}

			painelDeControle(contas);
			break;
		}
		case 6: {
			while (!opcao.equalsIgnoreCase("n")) {
				Transferir transferir = new Transferir();
				transferir.transferir(contas);
				System.out.print("Deseja transferir outro valor? (S/n): ");
				opcao = scanner.nextLine();
			}

			painelDeControle(contas);
			break;
		}
		default:
			System.out.println("Saindo do programa...");
		}

	}
}
