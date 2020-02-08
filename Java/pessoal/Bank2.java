package pessoal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank2 {

	static List<Client> clientes = new ArrayList<Client>();
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		interfacePrincipal();
		scanner.close();
	}
	
	public static void interfacePrincipal() {
		System.out.println("==== Painel Principal do Banco ====");
		
		System.out.println("1 - Criar novo registro\n2 - Modificar registro\n3 - Ver registro\n4 - Ver todos os registros\n5 - Deletar registro\n6 - Sair do Programa ");
		System.out.print("Escolha uma opção (1, 2, 3, 4, 5): ");
		int opcao = scanner.nextInt();
		scanner.nextLine(); // para tirar o excedente de linha.
		
		switch (opcao) {
		case 1: {
			novoCliente();
			break;
		}
		case 2: {
			editarCliente();
			break;
		}
		case 3: {
			getCliente();
			break;
		}
		case 4: {
			getAllCliente();
			break;
		}
		case 5: {
			deletarCliente();
			break;
		}
		}
	
		
	}
	
	public static void novoCliente() {
		
		System.out.print("\nDefina um Número de Identificação único: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // para tirar o excedente de linha.
		System.out.println("Defina o nome do cliente: ");
		String nome = scanner.nextLine();
		System.out.print("Defina o valor inicial na conta do cliente: ");
		double valor = scanner.nextDouble();
		
		System.out.printf("\nID do Cliente: %d\nNome do Cliente: %s\nTotal na Conta: R$%.2f\n\n", id, nome, valor);
		System.out.print("Esta informação está correta (s/n)? ");
		String conferir = scanner.next();
		if (conferir.equalsIgnoreCase("s")) {
			Client cliente = new Client(id, nome, valor);
			clientes.add(cliente);
			System.out.println("Cliente registrado com sucesso!");
		}
		
		System.out.println("Voltando ao Menu Principal...\n");
		interfacePrincipal();
	}
	
	public static void editarCliente() {
		
		System.out.print("\nDigite o número de identificação do cliente: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // para tirar o excedente de linha.
		for (int i = 0; i < clientes.size(); i++) {
			Client cliente = clientes.get(i);
			if (id == cliente.id) {
				System.out.printf("\nID do Cliente: %d\nNome do Cliente: %s\nTotal na Conta: %.2f\n", cliente.id, cliente.name, cliente.sum);
				System.out.println("\n1 - Número de Identificação\n2 - Nome\n3 - Valor Total na Conta\n\n");
				System.out.print("O que deseja modificar (1, 2, 3)? ");
				int opcao = scanner.nextInt();
				scanner.nextLine(); // para tirar o excedente de linha.
				
				switch (opcao) {
				case 1: {
					cliente.id = scanner.nextInt();
					scanner.nextLine(); // para tirar o excedente de linha.
					System.out.println("Número de identificação modificado com sucesso!");
					break;
				}
				case 2: {
					cliente.name = scanner.nextLine();
					System.out.println("Nome modificado com sucesso!");
					break;
				}
				case 3: {
					cliente.sum = scanner.nextDouble();
					System.out.println("Total na conta modificado com sucesso!");
					break;
				}
				}
			
			}
		}
		
		System.out.println("Voltando ao Menu Principal...\n");
		interfacePrincipal();
	}
	
	public static void getCliente() {
		
		System.out.print("Digite o número de identificação do cliente: ");
		int id = scanner.nextInt();
		
		for (int i = 0; i < clientes.size(); i++) {
			Client cliente = clientes.get(i);
			if (id == cliente.id) {
				System.out.printf("\nID do Cliente: %d\nNome do Cliente: %s\nTotal na Conta: %.2f\n", cliente.id, cliente.name, cliente.sum);
			}
		}
		
		System.out.println("Voltando ao Menu Principal...\n");
		interfacePrincipal();
	}
	
	public static void getAllCliente() {
		
		for (int i = 0; i < clientes.size(); i++) {
			Client cliente = clientes.get(i);
			System.out.printf("\nID do Cliente: %d\nNome do Cliente: %s\nTotal na Conta: %.2f\n", cliente.id, cliente.name, cliente.sum);
		}
		
		System.out.println("Voltando ao Menu Principal...\n");
		interfacePrincipal();
	}
	
	public static void deletarCliente() {
		
		System.out.print("\nDigite o número de identificação do cliente: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // para tirar o excedente de linha.
		
		for (int i = 0; i < clientes.size(); i++) {
			Client cliente = clientes.get(i);
			if (id == cliente.id) {
				System.out.printf("\nID do Cliente: %d\nNome do Cliente: %s\nTotal na Conta: %.2f\n\n", cliente.id, cliente.name, cliente.sum);
				System.out.print("Deseja mesmo deletar este registro (s/n)? ");
				String escolha = scanner.next();
				if (escolha.equalsIgnoreCase("s")) {
					clientes.remove(cliente);
					System.out.println("Registro deletado com sucesso!\n");
				}
				
			}
			
		}
		
		
		System.out.println("Voltando ao Menu Principal...\n");
		interfacePrincipal();
	}
	
}
