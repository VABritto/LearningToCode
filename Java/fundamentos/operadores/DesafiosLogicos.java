package fundamentos.operadores;

public class DesafiosLogicos {
	public static void main(String[] args) {
		// Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
		// Vai comprar uma televis�o de 50pl se ambos os trabalhos forem V
		// Vai comprar uma televis�o de 32pl se s� um dos trabalhos forem V
		// Se pelo menos um for V ent�o comprar�o sorvete
		// Se ambos derem F, fam�lia fica em casa

		boolean trabalho1 = true;
		boolean trabalho2 = true;
		boolean TV50 = trabalho1 && trabalho2;
		boolean TV32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean casa = !sorvete;

		System.out.println("Trabalhou na Ter�a? " + trabalho1);
		System.out.println("Trabalhou na Quinta? " + trabalho2);
		System.out.println("Comprou uma televis�o de 50\"? " + TV50);
		System.out.println("Comprou uma televis�o de 32\"? " + TV32);
		System.out.println("Compraram sorvete? " + sorvete);
		System.out.println("Ficaram em casa? " + casa);

	}
}
