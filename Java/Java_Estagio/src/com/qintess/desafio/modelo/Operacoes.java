package com.qintess.desafio.modelo;

import java.util.Date;

public class Operacoes {

	private long cdOperacao;
	private Date dtInicio;
	private Date dtFim;
	private String nmEmpresa;
	private String nmMesa;
	private String nmEstrategia;
	private String nmCentralizador;
	private String nmGestor;
	private String nmSubgestor;
	private String nmSubproduto;
	private String nmCaracteristica;
	private String cdAtivoObjeto;
	private double quantidade;
	private int idPreco;
	private long nuPrazoDiasCorridos;
	double vlPreco;
	private DadosMercado dadosMercado;
	
	public Operacoes(Date dtInicio, Date dtFim, double quantidade, int idPreco) {
		this.quantidade = quantidade;
		this.idPreco = idPreco;
		this.nuPrazoDiasCorridos = ((dtFim.getTime() - dtInicio.getTime()) / (24 * 60 * 60 * 1000));
	}
	
	public Operacoes(long cdOperacao, Date dtInicio, Date dtFim, String nmEmpresa, String nmMesa, String nmEstrategia,
			String nmCentralizador, String nmGestor, String nmSubgestor, String nmSubproduto, String nmCaracteristica,
			String cdAtivoObjeto, double quantidade, int idPreco) {
		this.cdOperacao = cdOperacao;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.nmEmpresa = nmEmpresa;
		this.nmMesa = nmMesa;
		this.nmEstrategia = nmEstrategia;
		this.nmCentralizador = nmCentralizador;
		this.nmGestor = nmGestor;
		this.nmSubgestor = nmSubgestor;
		this.nmSubproduto = nmSubproduto;
		this.nmCaracteristica = nmCaracteristica;
		this.cdAtivoObjeto = cdAtivoObjeto;
		this.quantidade = quantidade;
		this.idPreco = idPreco;
		this.nuPrazoDiasCorridos = ((dtFim.getTime() - dtInicio.getTime()) / (24 * 60 * 60 * 1000));
	}
	
	public void atribuirDadosMercado(DadosMercado dadosMercado) {
		this.dadosMercado = dadosMercado;
	}
	
	public long getCdOperacao() {
		return cdOperacao;
	}
	public void setCdOperacao(long cdOperacao) {
		this.cdOperacao = cdOperacao;
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
	public String getNmEmpresa() {
		return nmEmpresa;
	}
	public void setNmEmpresa(String nmEmpresa) {
		this.nmEmpresa = nmEmpresa;
	}
	public String getNmMesa() {
		return nmMesa;
	}
	public void setNmMesa(String nmMesa) {
		this.nmMesa = nmMesa;
	}
	public String getNmEstrategia() {
		return nmEstrategia;
	}
	public void setNmEstrategia(String nmEstrategia) {
		this.nmEstrategia = nmEstrategia;
	}
	public String getNmCentralizador() {
		return nmCentralizador;
	}
	public void setNmCentralizador(String nmCentralizador) {
		this.nmCentralizador = nmCentralizador;
	}
	public String getNmGestor() {
		return nmGestor;
	}
	public void setNmGestor(String nmGestor) {
		this.nmGestor = nmGestor;
	}
	public String getNmSubgestor() {
		return nmSubgestor;
	}
	public void setNmSubgestor(String nmSubgestor) {
		this.nmSubgestor = nmSubgestor;
	}
	public String getNmSubproduto() {
		return nmSubproduto;
	}
	public void setNmSubproduto(String nmSubproduto) {
		this.nmSubproduto = nmSubproduto;
	}
	public String getNmCaracteristica() {
		return nmCaracteristica;
	}
	public void setNmCaracteristica(String nmCaracteristica) {
		this.nmCaracteristica = nmCaracteristica;
	}
	public String getCdAtivoObjeto() {
		return cdAtivoObjeto;
	}
	public void setCdAtivoObjeto(String cdAtivoObjeto) {
		this.cdAtivoObjeto = cdAtivoObjeto;
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

	public DadosMercado getDadosMercado() {
		return dadosMercado;
	}

	public void setDadosMercado(DadosMercado dadosMercado) {
		this.dadosMercado = dadosMercado;
	}
	
	
	
}
