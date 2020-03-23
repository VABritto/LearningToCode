package com.qintess.jdbc.modelo;

/**
 * @author Qintess
 *
 */
public class Venda {

	private int idvenda;
	private int idcliente;
	private float total;
	
	public Venda(int idvenda, int idcliente, float total) {
		super();
		this.idvenda = idvenda;
		this.idcliente = idcliente;
		this.total = total;
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

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
}
