package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a média: ");
		double media = scanner.nextDouble();

		if (media <= 10 && media >= 7) { // Se houver só uma linha de código no if, não precisa da indentação.
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}

		if (media <= 7 && media >= 4.5) {
			System.out.println("Recuperação.");
		}

		boolean criterioReprovacaoAtingido = media < 4.5 && media >= 0; // Se quiser, pode usar isso.

		if (criterioReprovacaoAtingido) {
			System.out.println("Reprovado.");
		}

		scanner.close();
	}
}
