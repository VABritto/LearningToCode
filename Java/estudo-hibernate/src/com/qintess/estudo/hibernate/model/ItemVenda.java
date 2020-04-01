package com.qintess.estudo.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemVenda implements Entidade {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Produto produto;
	
	@ManyToOne
	private Venda venda;
	
	private int quantidade;
	
	private double preco_custo;
	
	private double preco_unit;
	
	public ItemVenda() {}
	
	public ItemVenda(Produto produto, Venda venda, int quantidade, double preco_custo, double preco_unit) {
		this.produto = produto;
		this.venda = venda;
		this.quantidade = quantidade;
		this.preco_custo = preco_custo;
		this.preco_unit = preco_unit;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco_custo() {
		return preco_custo;
	}

	public void setPreco_custo(double preco_custo) {
		this.preco_custo = preco_custo;
	}

	public double getPreco_unit() {
		return preco_unit;
	}

	public void setPreco_unit(double preco_unit) {
		this.preco_unit = preco_unit;
	}

	@Override
	public String toString() {
		return "ItemVenda [id=" + id + ", produto=" + produto + ", venda=" + venda + ", quantidade=" + quantidade
				+ ", preco_custo=" + preco_custo + ", preco_unit=" + preco_unit + "]";
	}
	
}
