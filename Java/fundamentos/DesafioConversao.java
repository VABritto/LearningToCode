package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o seu antipen�ltimo sal�rio: ");
		double salario1 = Double.parseDouble(scanner.nextLine().replace(",", "."));
		System.out.println("Digite o seu pen�ltimo sal�rio: ");
		double salario2 = Double.parseDouble(scanner.nextLine().replace(",", "."));
		System.out.println("Digite o seu �ltimo sal�rio: ");
		double salario3 = Double.parseDouble(scanner.nextLine().replace(",", "."));
		System.out.println("Somando os sal�rios digitados...");
		double somaSalarios = salario1 + salario2 + salario3;
		System.out.println("Definindo a m�dia salarial...");
		double mediaSalarios = somaSalarios / 3;
		System.out.printf("A sua m�dia salarial �:  R$%.2f", mediaSalarios);

		scanner.close();
	}
}
