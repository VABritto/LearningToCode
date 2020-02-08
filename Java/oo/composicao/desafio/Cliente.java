package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	final ArrayList<Compra> compras = new ArrayList<Compra>();
	final String nome;
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra (Compra compra) {
		this.compras.add(compra);
	}

	double totalCompras() {
		double totalCompras = 0;
		for (Compra compra: compras) {
			totalCompras += compra.obterValorTotal();
		}
		return totalCompras;
	}

}
