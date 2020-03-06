package com.qintess.banco.modelo;

public class Cliente {

	private String nome;
	private long cpf;
	private String senha;
	private String estadoCivil;
	private int idade;
	private String endereco;
	
	public Cliente(String nome, long cpf, String senha, String estadoCivil, int idade, String endereco) {
		setNome(nome);
		setCpf(cpf);
		setSenha(senha);
		setEstadoCivil(estadoCivil);
		setIdade(idade);
		setEndereco(endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
