package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String finalizador = "";
		System.out.println("Para sair, digite 'sair'. ");

		while (!finalizador.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			finalizador = scanner.nextLine();
		}

		System.out.println("Programa finalizado.");
		scanner.close();
	}
}
