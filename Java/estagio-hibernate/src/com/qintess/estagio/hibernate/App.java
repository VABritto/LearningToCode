package com.qintess.estagio.hibernate;

import com.qintess.estagio.hibernate.dao.DAO;
import com.qintess.estagio.hibernate.dao.ProdutoDao;
import com.qintess.estagio.hibernate.model.ItemVenda;
import com.qintess.estagio.hibernate.model.Produto;
import com.qintess.estagio.hibernate.model.Venda;

public class App {

	public static void main(String[] args) {
		
		DAO<Produto> daoProduto = new DAO<>();
		DAO<ItemVenda> daoItemVenda = new DAO<>();
		DAO<Venda> daoVenda = new DAO<>();
		
		Produto prod1 = new Produto("Bala Big", 0.25);
		Produto prod2 = new Produto("Bala 7Belo", 0.25);
		daoProduto.salvarOuAlterar(prod1);
		daoProduto.salvarOuAlterar(prod2);
		
		Venda venda = new Venda();
		ItemVenda iv1 = new ItemVenda(prod1, venda, 2);
		
		daoVenda.salvarOuAlterar(venda);
		
		daoItemVenda.salvarOuAlterar(iv1);
		
	}
}
