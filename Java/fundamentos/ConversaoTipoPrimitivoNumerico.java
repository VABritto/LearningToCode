package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {

		// Conversão implicita
		double a = 1;
		System.out.println(a);

		// Conversão explicita (CAST). EVITE USAR.
//		float b = 1.0F;
		float b = (float) 1.2345678999; // Mesma coisa, pode haver perda de informações na conversão
		System.out.println(b);

		int c = 4;
		byte d = (byte) c;
		System.out.println(d);

		double e = 1.9999;
		int f = (int) e;
		System.out.println(f); // Não se arredonda para cima. Os dados se perdem.

	}
}
