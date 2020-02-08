package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		String s = new String("2"); // Quando você cria um String especificamente assim
		System.out.println("2" == s);// o resultado dá Falso.
		System.out.println("2".equals(s));
		String g = "2"; // Se você cria o String desta maneira
		System.out.println("2" == g);// o resultado dá Verdadeiro.

		Scanner scanner = new Scanner(System.in);

//		String s2 = scanner.next(); // Tira os espaços em branco sem precisar do trim.
		String s2 = scanner.nextLine();

//		System.out.println("2" == s2); // Dá falso, mesmo se digitado corretamente.
//		System.out.println("2" == s2.trim()); // Tira os espaços em branco, mas ainda dá falso.
		System.out.println("2".equals(s2.trim()));

		scanner.close();
	}
}
