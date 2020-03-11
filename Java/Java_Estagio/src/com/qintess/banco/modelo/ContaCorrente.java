package com.qintess.banco.modelo;

public class ContaCorrente extends Conta {

	private double valorTaxa = 0.3;
	private final String designacao = "Conta Corrente";

	public ContaCorrente(int agencia, int numero, double saldoInicial, Cliente cliente) {
		super(agencia, numero, saldoInicial, cliente);
	}

	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	public String getDesignacao() {
		return designacao;
	}
	
}
