package com.qintess.jdbc.modelo;

public class Livro {
	
	private int idlivro;
	private String titulo;
	private float preco;
	private int estoque;
	private int idgenero;
	
	public Livro(int idlivro, String titulo, float preco) {
		this.idlivro = idlivro;
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public int getIdlivro() {
		return idlivro;
	}
	public void setIdlivro(int idlivro) {
		this.idlivro = idlivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public int getIdgenero() {
		return idgenero;
	}
	public void setIdgenero(int idgenero) {
		this.idgenero = idgenero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + estoque;
		result = prime * result + idgenero;
		result = prime * result + idlivro;
		result = prime * result + Float.floatToIntBits(preco);
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Livro other = (Livro) obj;
		if (estoque != other.estoque)
			return false;
		if (idgenero != other.idgenero)
			return false;
		if (idlivro != other.idlivro)
			return false;
		if (Float.floatToIntBits(preco) != Float.floatToIntBits(other.preco))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
}
