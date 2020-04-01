package com.qintess.estudo.hibernate.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Venda implements Entidade {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToMany(mappedBy = "venda")
	private List<ItemVenda> itens = new ArrayList<>();
	
	private Integer cliente_id;
	
	private double desconto;
	
	private int forma_pagamento;
	
	private Date data;
	
	public Venda() {}

	public Venda(Integer cliente_id, double desconto, int forma_pagamento) {
		this.cliente_id = cliente_id;
		this.forma_pagamento = forma_pagamento;
		this.data = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
		this.data = new Date();
	}
	
	public void setItem(ItemVenda itemVenda) {
		this.itens.add(itemVenda);
	}

	public List<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(List<ItemVenda> itens) {
		this.itens = itens;
		this.data = new Date();
	}

	public Integer getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Integer cliente_id) {
		this.cliente_id = cliente_id;
		this.data = new Date();
	}

	public int getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(int forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
		this.data = new Date();
	}
	
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public Date getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", itens=" + itens + ", cliente_id=" + cliente_id + ", forma_pagamento="
				+ forma_pagamento + ", data=" + data + "]";
	}
	
}
