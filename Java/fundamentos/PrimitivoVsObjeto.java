package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		// Objetos tem comportamento e m�todo relacionado, tipos primitivos, n�o.
		String s = new String("texto"); // Forma menos usual de criar String
		s.toUpperCase();

		// Wrappers s�o a vers�o objeto de tipos primitivos.
		int a = 35;
		System.out.println(a);

	}
}
