package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		// Objetos tem comportamento e método relacionado, tipos primitivos, não.
		String s = new String("texto"); // Forma menos usual de criar String
		s.toUpperCase();

		// Wrappers são a versão objeto de tipos primitivos.
		int a = 35;
		System.out.println(a);

	}
}
