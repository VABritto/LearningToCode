package com.qintess.desafio.modelo;

public class DadosMercado {

	private int idPreco;
	private long nuPrazoDiasCorridos;
	private double vlPreco;
	
	public DadosMercado(int idPreco, long nuPrazoDiasCorridos, double vlPreco) {
		super();
		this.idPreco = idPreco;
		this.nuPrazoDiasCorridos = nuPrazoDiasCorridos;
		this.vlPreco = vlPreco;
	}

	public int getIdPreco() {
		return idPreco;
	}
	public void setIdPreco(int idPreco) {
		this.idPreco = idPreco;
	}
	public long getNuPrazoDiasCorridos() {
		return nuPrazoDiasCorridos;
	}
	public void setNuPrazoDiasCorridos(long nuPrazoDiasCorridos) {
		this.nuPrazoDiasCorridos = nuPrazoDiasCorridos;
	}
	public double getVlPreco() {
		return vlPreco;
	}
	public void setVlPreco(double vlPreco) {
		this.vlPreco = vlPreco;
	}
	
}
