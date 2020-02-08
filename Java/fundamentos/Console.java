package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); // %n quebra a linha, %d � n�mero inteiro
		System.out.printf("Sal�rio: %.1f %n", 1234.5678); // %f � numero real, podendo determinar quantas casas voc�
															// quer considerar
		System.out.printf("Nome: %s%n", "Jo�o"); // %s � String

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();

		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();

		System.out.printf("Ol�, %s %s, prazer em te conhecer! Voc� tem %d anos de idade.%n", nome, sobrenome, idade);

		entrada.close();
	}
}
