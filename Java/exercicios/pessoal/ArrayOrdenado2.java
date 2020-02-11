package pessoal;

import java.util.Arrays;

public class ArrayOrdenado2 {

	public static void main(String[] args) {
		
		int[] array = {3, 1, 4, 8, 5};
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
}
