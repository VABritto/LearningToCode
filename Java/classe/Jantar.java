package classe;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa victor = new Pessoa("Victor", 90);
		Comida arroz = new Comida("arroz", 0.319);
		Comida feijao = new Comida("feijão", 0.223);
		
		System.out.printf("Victor está com %.2fkg.\n", victor.peso);
		System.out.println(victor.comer(arroz));
		System.out.printf("Victor está com %.2fkg.\n", victor.peso);
		System.out.println(victor.comer(feijao));
		System.out.printf("Victor está com %.2fkg.\n", victor.peso);
	}
}
