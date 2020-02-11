package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	double valorTotal = 0;
	final ArrayList<Item> itens = new ArrayList<>();
	
	
	
	
	double obterValorTotal () {
		for (Item item: itens) {
			valorTotal += item.produto.preco * item.quantidade;
		}
		
		return valorTotal;
	}
	
	void adicionarItem (Produto produto, int quantidade) {
		this.itens.add(new Item(produto, quantidade));
	}
}
