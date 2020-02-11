package classe;

public class ProdutoTeste {
	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89);

		var p2 = new Produto(); // Também é válido com var, pois o java pode
		p2.nome = "Caneta Preta"; // inferir o tipo.
		p2.preco = 12.56;

//		System.out.println(p1.nome);
//		System.out.println(p2.nome);
		
		Produto.desconto = 0.5; // Pra mudar um valor estático.

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
//		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
//		System.out.printf("Média do carrinho = R$%.2f. \n", mediaCarrinho);
		System.out.printf("%s: R$%.2f \n%s: R$%.2f", p1.nome, precoFinal1, p2.nome, 
				precoFinal2);

	}
}
