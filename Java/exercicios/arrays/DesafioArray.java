package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double[] notas;
		int tamanhoDoArray;
		double soma = 0;
		double media = 0;
		
		System.out.print("Quantas notas você quer informar? ");
		tamanhoDoArray = scanner.nextInt();
		System.out.println("Criando lista...");
		notas = new double[tamanhoDoArray];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i + 1) + ": ");
			notas[i] = scanner.nextDouble();
		}
		
		System.out.println("Somando notas...");
		for (double nota : notas) {
			soma += nota;
		}
		
		System.out.println("Calculando a média...");
		media = soma /notas.length;
		System.out.println("Média: " + media);

		scanner.close();
	}
}
