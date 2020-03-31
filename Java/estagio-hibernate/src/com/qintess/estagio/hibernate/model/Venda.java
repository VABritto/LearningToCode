package com.qintess.estagio.hibernate.model;

import java.util.ArrayList;
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
	
	private double total;
	
	public Venda() {}

	public Venda(List<ItemVenda> itens) {
		this.itens = itens;
		for (ItemVenda iv: itens) {
			this.total += iv.getSubtotal();
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(List<ItemVenda> itens) {
		this.itens = itens;
		for(ItemVenda iv: itens) {
			this.total += iv.getSubtotal();
		}
	}
	
	public void setItem(ItemVenda iv) {
		this.itens.add(iv);
		this.total += iv.getSubtotal();
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
}
