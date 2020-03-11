package com.qintess.banco.executa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.qintess.banco.modelo.Cliente;
import com.qintess.banco.modelo.ContaCorrente;
import com.qintess.banco.modelo.ContaPoupanca;

public class ExecutaArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:\\eclipse-workspace\\Java_Estagio\\src\\contas");
		
		Scanner scanner = new Scanner(file);
		
		while (scanner.hasNextLine()) {
			String[] colunas = scanner.nextLine().split(";");
			
			int agencia = Integer.parseInt(colunas[0]);
			int numero = Integer.parseInt(colunas[1]);
			double saldoInicial = Double.parseDouble(colunas[3].replace(",", "."));
			String cpf = colunas[4];
			String senha = colunas[5];
			String nome = colunas[6];
			int idade = Integer.parseInt(colunas[7]);
			String estadoCivil = colunas[8];
			String endereco = colunas[9];
			String tipoConta = colunas[10];
			
			Cliente cliente = new Cliente(nome, cpf, senha, estadoCivil, idade, endereco);
			
			if (tipoConta.equalsIgnoreCase("CC")) {
				ContaCorrente contaCorrente = new ContaCorrente(agencia, numero, saldoInicial, cliente);
				System.out.println("\nNome: " + contaCorrente.getCliente().getNome()
						+ "\nIdade: " + contaCorrente.getCliente().getIdade()
						+ "\nCPF: " + contaCorrente.getCliente().getCpf()
						+ "\nEstado Civil: " + contaCorrente.getCliente().getEstadoCivil()
						+ "\nEndereço: " + contaCorrente.getCliente().getEndereco()
						+ "\nConta: " + contaCorrente.getAgencia() + "-" + contaCorrente.getNumero()
						+ "\nTipo de Conta: " + contaCorrente.getDesignacao()
						+ "\nSaldo: R$" + Double.toString(contaCorrente.getSaldo()).replace(".", ","));
			} else {
				ContaPoupanca contaPoupanca = new ContaPoupanca(agencia, numero, saldoInicial, cliente);
				System.out.println("\nNome: " + contaPoupanca.getCliente().getNome()
						+ "\nIdade: " + contaPoupanca.getCliente().getIdade()
						+ "\nCPF: " + contaPoupanca.getCliente().getCpf()
						+ "\nEstado Civil: " + contaPoupanca.getCliente().getEstadoCivil()
						+ "\nEndereço: " + contaPoupanca.getCliente().getEndereco()
						+ "\nConta: " + contaPoupanca.getAgencia() + "-" + contaPoupanca.getNumero()
						+ "\nTipo de Conta: " + contaPoupanca.getDesignacao()
						+ "\nSaldo: R$" + Double.toString(contaPoupanca.getSaldo()).replace(".", ","));
			}
			
			
		}
		scanner.close();
	}
}
