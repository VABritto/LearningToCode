package com.qintess.jdbc.modelo;

public class Venda {

	private int idvenda;
	private int idcliente;
	
	public Venda(int idvenda, int idcliente) {
		super();
		this.idvenda = idvenda;
		this.idcliente = idcliente;
	}
	
	public int getIdvenda() {
		return idvenda;
	}
	public void setIdvenda(int idvenda) {
		this.idvenda = idvenda;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	
}
