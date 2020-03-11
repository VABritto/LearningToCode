package com.qintess.banco.modelo;

public class ContaPoupanca extends Conta {

	private final String designacao = "Conta Poupança";
	
	public ContaPoupanca(int agencia, int numero, double saldoInicial, Cliente cliente) {
		super(agencia, numero, saldoInicial, cliente);
	}

	public String getDesignacao() {
		return designacao;
	}
	
}
