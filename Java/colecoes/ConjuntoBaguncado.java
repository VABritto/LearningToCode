package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double (classe).
		conjunto.add(true);
		conjunto.add("Teste"); 
		conjunto.add(1); 
		conjunto.add('x');
		
		System.out.printf("Tamanho �: %d.\n", conjunto.size());
//		conjunto.add("teste"); // N�o h� repeti��o, pois este teste tem t min�sculo.
		conjunto.add('x'); // N�o registra, pois � uma repeti��o.
		System.out.printf("Tamanho �: %d.\n", conjunto.size());
		System.out.println(conjunto.remove("batata")); // D� falso, pois n�o tem batata
													  // dentro do conjunto.
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.printf("Tamanho �: %d.\n", conjunto.size());
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums); // Uni�o entre dois conjuntos.
		conjunto.retainAll(nums); // Somente o que est� nos dois conjuntos
		System.out.println(conjunto); // ser� retido.
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
	}
}
