package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = 3 > 7; // Vai dar falso.

		System.out.println(condicao1 && condicao2); // Operador lógico AND
		System.out.println(condicao1 || condicao2); // Operador lógico OR
		System.out.println(condicao1 ^ condicao2); // Operador lógico XOR
		System.out.println(!condicao1); // Operador lógico NOT
		System.out.println(!!condicao2); // Dá pra fazer dupla negação

		System.out.println("\nTabela Verdade AND");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true); // DEAD CODE
//		System.out.println(false && false); // DEAD CODE

		System.out.println("\nTabela Verade OR");
//		System.out.println(true || true); // DEAD CODE
//		System.out.println(true || false); // DEAD CODE
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("\nTabela Verdade XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		System.out.println("\nTabela Verdade NOT");
		System.out.println(!true);
		System.out.println(!false);

	}
}
