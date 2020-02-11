package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		// Calcular a m�dia das notas de uma turma.

		Scanner scanner = new Scanner(System.in);

		double digitado = 0;
		double total = 0;
		double contador = 0;
		double media;

		System.out.println("Ol�! Por favor, informe as notas dos alunos individualmente" + ", de 0 a 10.");
		System.out.println("Quando finalizar, digite '-1'.");

		while (digitado != -1) {
			total += digitado;
			digitado = Double.parseDouble(scanner.next());

			while (digitado < -1 || digitado > 10) {
				System.out.println("Nota inv�lida. Por favor, digite uma nota correta");
				digitado = Double.parseDouble(scanner.next());
			}

			System.out.println("Nota registrada...");
			contador++;
		}

		contador--;
		media = total / contador;
		System.out.printf("A m�dia dos alunos �: %.2f", media);

		scanner.close();

	}
}
