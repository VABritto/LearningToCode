package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = 3 > 7; // Vai dar falso.

		System.out.println(condicao1 && condicao2); // Operador l�gico AND
		System.out.println(condicao1 || condicao2); // Operador l�gico OR
		System.out.println(condicao1 ^ condicao2); // Operador l�gico XOR
		System.out.println(!condicao1); // Operador l�gico NOT
		System.out.println(!!condicao2); // D� pra fazer dupla nega��o

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
