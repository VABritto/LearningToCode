package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();
		System.out.println("Digite o operador: ");
		String operador = scanner.next();
		System.out.println("Digite o segundo número: ");
		double num2 = scanner.nextDouble();

		double sum = "+".equals(operador) ? num1 + num2 : 0;
		sum = "-".equals(operador) ? num1 - num2 : sum;
		sum = "*".equals(operador) ? num1 * num2 : sum;
		sum = "/".equals(operador) ? num1 / num2 : sum;
		sum = "%".equals(operador) ? num1 % num2 : sum;

		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, sum);

		scanner.close();
	}
}
