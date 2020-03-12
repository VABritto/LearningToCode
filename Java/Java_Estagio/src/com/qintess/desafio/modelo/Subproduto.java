package com.qintess.desafio.modelo;

import java.util.ArrayList;
import java.util.List;

public class Subproduto {

	private String nmSubproduto;
	private List<Operacoes> listaOperacoes = new ArrayList<Operacoes>();
	private double resultado = 0;
	
	public Subproduto(String nmSubproduto, Operacoes operacoes) {
		this.nmSubproduto = nmSubproduto;
		setListaOperacoes(operacoes);
	}

	public String getNmSubproduto() {
		return nmSubproduto;
	}

	public void setNmSubproduto(String nmSubproduto) {
		this.nmSubproduto = nmSubproduto;
	}

	public List<Operacoes> getListaOperacoes() {
		return listaOperacoes;
	}

	public void setListaOperacoes(Operacoes operacoes) {
		this.listaOperacoes.add(operacoes);
	}
	
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double vlPreco, double quantidade) {
		this.resultado += (vlPreco * quantidade);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nmSubproduto == null) ? 0 : nmSubproduto.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subproduto other = (Subproduto) obj;
		if (nmSubproduto == null) {
			if (other.nmSubproduto != null)
				return false;
		} else if (!nmSubproduto.equals(other.nmSubproduto))
			return false;
		return true;
	}
	
	
	
}
