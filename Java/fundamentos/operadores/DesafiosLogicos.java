package fundamentos.operadores;

public class DesafiosLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// Vai comprar uma televisão de 50pl se ambos os trabalhos forem V
		// Vai comprar uma televisão de 32pl se só um dos trabalhos forem V
		// Se pelo menos um for V então comprarão sorvete
		// Se ambos derem F, família fica em casa

		boolean trabalho1 = true;
		boolean trabalho2 = true;
		boolean TV50 = trabalho1 && trabalho2;
		boolean TV32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean casa = !sorvete;

		System.out.println("Trabalhou na Terça? " + trabalho1);
		System.out.println("Trabalhou na Quinta? " + trabalho2);
		System.out.println("Comprou uma televisão de 50\"? " + TV50);
		System.out.println("Comprou uma televisão de 32\"? " + TV32);
		System.out.println("Compraram sorvete? " + sorvete);
		System.out.println("Ficaram em casa? " + casa);

	}
}
