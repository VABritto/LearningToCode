package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		String s = "Good Morning, X!";
		s = s.replace("X", "Sir");
		s = s.toUpperCase();
		s = s.concat("!!");

		System.out.println(s);

		System.out.println("Leo".toUpperCase());

		String x = "Bom dia, X!".replace("X", "Gui").toUpperCase().concat("!!");
		System.out.println(x);

		// Tipos primitivos não tem o operador .
	}
}
