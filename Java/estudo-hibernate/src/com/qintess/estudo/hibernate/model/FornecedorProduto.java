package com.qintess.estudo.hibernate.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class FornecedorProduto implements Entidade {

	@EmbeddedId
	private FornecedorProdutoId id;
	
	private int estoque;
	
	private double preco_custo;
	
	public FornecedorProduto() {}
	
	public FornecedorProduto(Fornecedor fornecedor, Produto produto, int estoque, double preco_custo) {
		this.id = new FornecedorProdutoId(fornecedor, produto);
		this.estoque = estoque;
		this.preco_custo = preco_custo;
	}

	public Fornecedor getFornecedor() {
		return id.getFornecedor();
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.id.setFornecedor(fornecedor);
	}

	public Produto getProduto() {
		return id.getProduto();
	}

	public void setProduto(Produto produto) {
		this.id.setProduto(produto);
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getPreco_custo() {
		return preco_custo;
	}

	public void setPreco_custo(double preco_custo) {
		this.preco_custo = preco_custo;
	}

	@Override
	public FornecedorProdutoId getId() {
		return id;
	}
	
	public void setId(FornecedorProdutoId id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "FornecedorProduto [id=" + id + ", estoque=" + estoque + ", preco_custo=" + preco_custo + "]";
	}
	
}
