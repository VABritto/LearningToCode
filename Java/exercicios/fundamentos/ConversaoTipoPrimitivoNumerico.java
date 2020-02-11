package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {

		// Convers�o implicita
		double a = 1;
		System.out.println(a);

		// Convers�o explicita (CAST). EVITE USAR.
//		float b = 1.0F;
		float b = (float) 1.2345678999; // Mesma coisa, pode haver perda de informa��es na convers�o
		System.out.println(b);

		int c = 4;
		byte d = (byte) c;
		System.out.println(d);

		double e = 1.9999;
		int f = (int) e;
		System.out.println(f); // N�o se arredonda para cima. Os dados se perdem.

	}
}
