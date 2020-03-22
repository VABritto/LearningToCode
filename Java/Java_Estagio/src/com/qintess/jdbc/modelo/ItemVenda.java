package com.qintess.jdbc.modelo;

public class ItemVenda {

	private int idvenda;
	private int idlivro;
	private int qtd;
	private float subtotal;
	
	public ItemVenda(int idvenda, int idlivro, int qtd, float subtotal) {
		this.idvenda = idvenda;
		this.idlivro = idlivro;
		this.qtd = qtd;
		this.subtotal = subtotal;
	}
	
	public int getIdvenda() {
		return idvenda;
	}
	public void setIdvenda(int idvenda) {
		this.idvenda = idvenda;
	}
	public int getIdlivro() {
		return idlivro;
	}
	public void setIdlivro(int idlivro) {
		this.idlivro = idlivro;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	
}
