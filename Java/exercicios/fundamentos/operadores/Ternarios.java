package fundamentos.operadores;

public class Ternarios {
	public static void main(String[] args) {
		double resultadoParcial = 7.6;
		String resultadoFinal = resultadoParcial >= 7.0 ? "aprovado." : "em recupera��o.";

		System.out.println("O aluno est� " + resultadoFinal);

		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "N�o";

		System.out.printf("\nTem desconto? %s", resultado);
	}
}
