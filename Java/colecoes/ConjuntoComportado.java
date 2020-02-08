package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
//		Set<String> listaAprovados = new HashSet<>(); // Onde ta <> eu poderia
		SortedSet<String> listaAprovados = new TreeSet<>(); // colocar <String>.
//		TreeSet<String> listaAprovados = new TreeSet<>(); // TreeSet garante a 
														   // ordem de inserção.
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();  
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for (int n: nums) {
			System.out.println(n);
		}
		
	}
}
