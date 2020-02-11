package controle;

public class For3 {
	public static void main(String[] args) {

		for (byte i = 0; i <= 10; i++) {
			for (byte j = 0; j <= 10; j++) {
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}

//		int i = 0;
//		
//		for (; i < 10; i++) { // Para acessar a variável fora do loop, ela precisa ser
//			System.out.println(i); // criada fora do loop.
//		}
//		
//		System.out.println("esse é o i = " + i); // Só posso acessar o i aqui por isso.
	}
}
