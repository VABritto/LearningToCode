package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) * 5/9 = ºC
		final double AJUSTE = 32;
		final double MULTIPLICADOR = 5.0 / 9.0;
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * MULTIPLICADOR;
		System.out.println(celsius);

	}
}
