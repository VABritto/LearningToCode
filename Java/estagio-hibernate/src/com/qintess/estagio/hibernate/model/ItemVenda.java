package com.qintess.estagio.hibernate.model;

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
	
	private int qtd;
	
	private double subtotal;
	
	public ItemVenda() {}
	
	public ItemVenda(Produto produto, Venda venda, int qtd) {
		this.produto = produto;
		this.venda = venda;
		this.qtd = qtd;
		this.subtotal = produto.getPreco() * qtd;
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

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
		this.subtotal = this.getProduto().getPreco() * this.qtd;
	}

	public double getSubtotal() {
		return subtotal;
	}
	
}
