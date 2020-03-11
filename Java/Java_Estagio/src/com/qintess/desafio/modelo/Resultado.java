package com.qintess.desafio.modelo;

public class Resultado {

	private DadosMercado dadosMercado;
	private Operacoes operacoes;
	
	public Resultado(DadosMercado dadosMercado, Operacoes operacoes) {
		this.dadosMercado = dadosMercado;
		this.operacoes = operacoes;
	}
	
	public double precoPorQuantidade () {
		double preco = dadosMercado.getVlPreco();
		double quantidade = operacoes.getQuantidade();
		double resultado = preco*quantidade;
		return resultado;
	}

	public DadosMercado getDadosMercado() {
		return dadosMercado;
	}

	public void setDadosMercado(DadosMercado dadosMercado) {
		this.dadosMercado = dadosMercado;
	}

	public Operacoes getOperacoes() {
		return operacoes;
	}

	public void setOperacoes(Operacoes operacoes) {
		this.operacoes = operacoes;
	}
	
}
