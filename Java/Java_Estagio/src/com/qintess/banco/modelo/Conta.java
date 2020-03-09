package com.qintess.banco.modelo;

public class Conta {

	private int agencia;
	private int numero;
	private double saldo;
	private double taxaSaque = 0.30;
	private double taxaTransfer = 4.0;
	private double taxaLimite = 2.0;
	private double limite = 300;
	private double buffer = 0;
	
	private Cliente cliente;

	public Conta(int agencia, int numero, double saldoInicial, Cliente cliente) {
		setAgencia(agencia);
		setNumero(numero);
		setSaldo(saldoInicial);
		setCliente(cliente);
	}

	public void depositar (double deposito) {
		this.saldo += deposito;
		if (this.saldo >= this.buffer) {
			this.saldo -= this.buffer;
			this.buffer = 0;
		} else if (this.saldo > 0) {
			this.buffer -= this.saldo;
			this.saldo = 0;
		}
	}
	
	public void sacar (double saque) {
		if ((this.saldo + limite) < saque) {
			System.out.println("Saldo insuficiente.");
		} else if (this.saldo < saque) {
			System.out.println("Valor sacado: R$" + saque);
			saque -= this.saldo;
			this.saldo = 0;
			this.buffer += (taxaLimite + saque);
		} else if (this.saldo < (saque + taxaSaque) && this.buffer == 0) {
			this.buffer = taxaSaque;
			this.saldo -= saque;
			System.out.println("Valor sacado: R$" + saque);
		} else if (this.saldo >= (saque + taxaSaque) && this.buffer == 0 ) {
			this.saldo -= (saque + taxaSaque);
			System.out.println("Valor sacado: R$" + saque);
		} else if (this.saldo < (saque + taxaSaque + buffer) && this.buffer != 0) {
			this.saldo -= (saque + taxaSaque);
			System.out.println("Valor sacado: R$" + saque);
		} else {
			this.saldo -= (saque + taxaSaque + buffer);
			this.buffer = 0;
			System.out.println("Valor sacado: R$" + saque);
		}
	}
	
	public void transferir (Conta transferida, double valor) {
		if (this == transferida) {
			System.out.println("Operação inválida.");
		} else {
			if (this.saldo < valor) {
				System.out.println("Saldo insuficiente.");
			} else if (this.saldo < (valor + taxaTransfer) && this.buffer == 0) {
				this.buffer = taxaTransfer;
				this.saldo -= valor;
				transferida.depositar(valor);
				System.out.println("Valor transferido: R$" + valor);
			} else if (this.saldo >= (valor + taxaTransfer) && this.buffer == 0 ) {
				this.saldo -= (valor + taxaTransfer);
				transferida.depositar(valor);
				System.out.println("Valor transferido: R$" + valor);
			} else if (this.saldo < (valor + taxaTransfer + buffer) && this.buffer != 0) {
				this.saldo -= (valor + taxaTransfer);
				transferida.depositar(valor);
				System.out.println("Valor transferido: R$" + valor);
			} else {
				this.saldo -= (valor + taxaTransfer + buffer);
				this.buffer = 0;
				transferida.depositar(valor);
				System.out.println("Valor transferido: R$" + valor);
			}
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void getConta() {
		
		System.out.println("CONTA " + this.getAgencia() + "-" + this.getNumero() 
		+ "----\nNome: " + cliente.getNome() + "\nCPF: " 
		+ cliente.getCpf() + "\nIdade: " + cliente.getIdade() + "\nEstado Civil: " 
		+ cliente.getEstadoCivil() + "\nEndereço: " + cliente.getEndereco());
		
		System.out.printf("\nConta: %d-%d \nSaldo Atual: R$%.2f\n", this.getAgencia(), 
				this.getNumero(), this.getSaldo());
	}

	public double getBuffer() {
		return buffer;
	}

	public void setBuffer(double buffer) {
		this.buffer = buffer;
	}

	public double getTaxaSaque() {
		return taxaSaque;
	}

	public void setTaxaSaque(double taxaSaque) {
		this.taxaSaque = taxaSaque;
	}

	public double getTaxaTransfer() {
		return taxaTransfer;
	}

	public void setTaxaTransfer(double taxaTransfer) {
		this.taxaTransfer = taxaTransfer;
	}

	public double getTaxaLimite() {
		return taxaLimite;
	}

	public void setTaxaLimite(double taxaLimite) {
		this.taxaLimite = taxaLimite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
