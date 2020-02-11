package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a m�dia: ");
		double media = scanner.nextDouble();

		if (media <= 10 && media >= 7) { // Se houver s� uma linha de c�digo no if, n�o precisa da indenta��o.
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}

		if (media <= 7 && media >= 4.5) {
			System.out.println("Recupera��o.");
		}

		boolean criterioReprovacaoAtingido = media < 4.5 && media >= 0; // Se quiser, pode usar isso.

		if (criterioReprovacaoAtingido) {
			System.out.println("Reprovado.");
		}

		scanner.close();
	}
}
