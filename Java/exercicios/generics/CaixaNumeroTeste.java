package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(3.2);
		
		Double coisaA = caixaA.abrir();
		System.out.println(coisaA);
	}
}
