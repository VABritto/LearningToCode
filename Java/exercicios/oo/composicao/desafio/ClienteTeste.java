package oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("João Pedro");
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		Produto produto1 = new Produto("Caneta Preta", 2.00);
		Produto produto2 = new Produto("Caneta Azul", 2.00);
		Produto produto3 = new Produto("Caneta Vermelha", 2.00);
		Produto produto4 = new Produto("Caneta Verde", 2.00);
		Produto produto5 = new Produto("Caneta Roxa", 2.00);
		
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		compra1.adicionarItem(produto1, 100);
		compra1.adicionarItem(produto2, 100);
		compra2.adicionarItem(produto3, 100);
		compra2.adicionarItem(produto4, 100);
		compra2.adicionarItem(produto5, 100);
		System.out.printf("O total de compras: R$%.2f", cliente1.totalCompras());
		
		
	}
}
