package com.qintess.jdbc.modelo;

public class Escreve {

	private int idlivro;
	private int idautor;
	
	public Escreve(int idlivro, int idautor) {
		super();
		this.idlivro = idlivro;
		this.idautor = idautor;
	}
	public int getIdlivro() {
		return idlivro;
	}
	public void setIdlivro(int idlivro) {
		this.idlivro = idlivro;
	}
	public int getIdautor() {
		return idautor;
	}
	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idautor;
		result = prime * result + idlivro;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Escreve other = (Escreve) obj;
		if (idautor != other.idautor)
			return false;
		if (idlivro != other.idlivro)
			return false;
		return true;
	}
	
}
