package com.qintess.desafio.modelo;

import java.util.Date;

public class Operacoes {

	private Date dtInicio;
	private Date dtFim;
	private String nmSubproduto;
	private double quantidade;
	private int idPreco;
	private long nuPrazoDiasCorridos;
	double vlPreco;
	
	public Operacoes(Date dtInicio, Date dtFim, double quantidade, int idPreco) {
		this.quantidade = quantidade;
		this.idPreco = idPreco;
		this.nuPrazoDiasCorridos = ((dtFim.getTime() - dtInicio.getTime()) / (24 * 60 * 60 * 1000));
	}	

	public Date getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	public Date getDtFim() {
		return dtFim;
	}
	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
	
	public String getNmSubproduto() {
		return nmSubproduto;
	}
	public void setNmSubproduto(String nmSubproduto) {
		this.nmSubproduto = nmSubproduto;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public long getIdPreco() {
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
