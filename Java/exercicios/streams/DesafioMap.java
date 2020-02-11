package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		/*
		 * 1. Número para string binária... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter devolta para inteiro => "011" => 3
		 * 
		 * Integer.
		 */
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Function<String, Integer> binaryToDecimal = 
				binary -> Integer.parseInt(binary, 2);
		UnaryOperator<String> reverseString = 
				input -> new StringBuilder(input).reverse().toString();
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(reverseString)
		.map(binaryToDecimal)
		.forEach(System.out::println);
		
	}
}
