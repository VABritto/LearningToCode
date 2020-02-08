package fundamentos;

//import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {

//		Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 100;

		// short
		Short s = 1000;

		// int
//		Integer i = Integer.parseInt(entrada.next()); String convertido para int
		Integer i = 10_000;

		// long
		Long l = 100_000_000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
//		entrada.close();

		// float
		Float f = 123.10F;
		System.out.println(f);

		// double
		Double d = 1234.5678;
		System.out.println(d);

		// boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		System.out.println(("" + bo).toUpperCase()); // Não recomendado

		// char
		Character c = 'A';
		System.out.println(c.toString());
		System.out.println(c + "..."); // Da no mesmo

	}
}
