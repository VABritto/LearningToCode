package com.qintess.jdbc.modelo;

public class Cliente {

	private int idcliente;
	private String nome;
	private String telefone;
	
	public Cliente(int idcliente, String nome, String telefone) {
		this.idcliente = idcliente;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
