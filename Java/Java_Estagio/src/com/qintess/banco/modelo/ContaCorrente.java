package com.qintess.banco.modelo;

public class ContaCorrente extends Conta {

	double valorTaxa;

	public ContaCorrente(int agencia, int numero, double saldoInicial, Cliente cliente, 
			double valorTaxa) {
		super(agencia, numero, saldoInicial, cliente);
		this.valorTaxa = valorTaxa;
	}
	
	
}
