package pessoal;

import java.util.Arrays;

public class ArrayOrdenado {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 9, 7, 4, 8, 2, 6};
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
}
