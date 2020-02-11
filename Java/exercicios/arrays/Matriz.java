package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[][] alunos;
		double media;
		int numeroDeEstudantes;
		int numeroDeNotas;
		double soma = 0;
		
		System.out.print("Please define how many students will be on the list: ");
		numeroDeEstudantes = scanner.nextInt();
		
		System.out.print("\nPlease define how many grades will be given per student: ");
		numeroDeNotas = scanner.nextInt();
		
		System.out.println("Creating list...");
		alunos = new double[numeroDeEstudantes][numeroDeNotas];
		
		for (int i = 0; i < alunos.length; i++) {
			for (int j = 0; j < alunos[i].length; j++) {
				System.out.print("\nPlease input grade Nº" + (j + 1) 
						+ " for student Nº" + (i + 1) + ": ");
				double nota = scanner.nextDouble();
				alunos[i][j] = nota;
				soma += nota;
			}
		}
		
		for (double[] notasDoAluno: alunos) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
//		System.out.println("Notas de todos os alunos: ");
//		System.out.println(Arrays.deepToString(alunos)); // Mais especializado.
		
		
		media = soma/(numeroDeEstudantes * numeroDeNotas);
		
		System.out.print("A média das notas é: " + media);

		scanner.close();
		
		
		
	}
}
