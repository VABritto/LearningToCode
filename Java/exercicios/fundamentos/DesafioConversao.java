package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o seu antipenúltimo salário: ");
		double salario1 = Double.parseDouble(scanner.nextLine().replace(",", "."));
		System.out.println("Digite o seu penúltimo salário: ");
		double salario2 = Double.parseDouble(scanner.nextLine().replace(",", "."));
		System.out.println("Digite o seu último salário: ");
		double salario3 = Double.parseDouble(scanner.nextLine().replace(",", "."));
		System.out.println("Somando os salários digitados...");
		double somaSalarios = salario1 + salario2 + salario3;
		System.out.println("Definindo a média salarial...");
		double mediaSalarios = somaSalarios / 3;
		System.out.printf("A sua média salarial é:  R$%.2f", mediaSalarios);

		scanner.close();
	}
}
