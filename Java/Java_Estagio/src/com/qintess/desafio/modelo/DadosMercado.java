package com.qintess.desafio.modelo;

public class DadosMercado {

	private long idPreco;
	private long nuPrazoDiasCorridos;
	private double vlPreco;
	
	public DadosMercado(long idPreco, long nuPrazoDiasCorridos, double vlPreco) {
		this.idPreco = idPreco;
		this.nuPrazoDiasCorridos = nuPrazoDiasCorridos;
		this.vlPreco = vlPreco;
	}
	
	public long getIdPreco() {
		return idPreco;
	}
	public void setIdPreco(long idPreco) {
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
