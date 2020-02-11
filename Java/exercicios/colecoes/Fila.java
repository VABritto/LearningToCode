package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> Adicionam elementos na fila.
		// A diferença é o comportamento quando a fila está cheia.
		fila.add("Ana"); // Retorna falso se nulo.
		fila.offer("Bia"); // Lança uma exceção se nulo.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); // Mostra o primeiro elemento da fila.
		System.out.println(fila.element()); // O mesmo. Mas a fila não pode 
											// estar vazia.
		System.out.println(fila.poll()); // Mostra o primeiro elemento da fila
		System.out.println(fila.poll()); // e o remove.
		System.out.println(fila.remove()); // Retorna exceção, se nulo.
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // Retorna null se não tiver elementos.
		
	}
}
