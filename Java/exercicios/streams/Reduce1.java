package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		int total1 = nums.stream().reduce(soma).get();
		
		System.out.println(total1);
		
		Integer total2 = nums.parallelStream().reduce(100, soma); // Usar Integer é 
		System.out.println(total2);					// mais seguro do que int pois 
													// evita exceções com nulo.
													// Fazer parallelStream soma
													// todos individualmente.
		// Resultado foi um Optional<Integer>...
		nums.stream()
		.filter(n -> n > 5)
		.reduce(soma)
		.ifPresent(System.out::println);
		
		
		
	}
}
