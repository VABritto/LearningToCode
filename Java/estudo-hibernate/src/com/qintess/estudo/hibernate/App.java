package com.qintess.estudo.hibernate;

import com.qintess.estudo.hibernate.dao.DAO;
import com.qintess.estudo.hibernate.model.Fornecedor;
import com.qintess.estudo.hibernate.model.FornecedorProduto;
import com.qintess.estudo.hibernate.model.ItemVenda;
import com.qintess.estudo.hibernate.model.Produto;
import com.qintess.estudo.hibernate.model.Venda;

public class App {

	public static void main(String[] args) {
		
		
		DAO<Fornecedor> DAOFornecedor = new DAO<Fornecedor>();
		DAO<Produto> DAOProduto = new DAO<Produto>();
		DAO<FornecedorProduto> DAOFP = new DAO<FornecedorProduto>();
		DAO<Venda> DAOVenda = new DAO<Venda>();
		DAO<ItemVenda> DAOItemVenda = new DAO<ItemVenda>();
		
		Fornecedor fornecedor = new Fornecedor("Victor Britto", "013991111111", 
												"batata@batata.com.br");
		DAOFornecedor.salvarOuAlterar(fornecedor);
		Produto produto = new Produto(10000.0, 10, "Batata de Ouro");
		DAOProduto.salvarOuAlterar(produto);
		FornecedorProduto fornecedorProduto = new FornecedorProduto(fornecedor, produto, 100, 3000.0);
		DAOFP.salvarOuAlterar(fornecedorProduto);
		Venda venda = new Venda(1, 0.5, 1);
		ItemVenda iv = new ItemVenda(produto, venda, 10, 3000.0, 10000.0);
		venda.setItem(iv);
		DAOVenda.salvarOuAlterar(venda);
		DAOItemVenda.salvarOuAlterar(iv);
		
	}
}
