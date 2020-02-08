package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário

		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;

		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipo booleano
		boolean estaDeFerias = false; // Ou true

		// Tipo caractere (Só usa um caractere)
		char status = 'A'; // Ativo; backdash e a letra u mais o numero representa um caractere de unicode

		// Dias de empresa
		System.out.println("O funcionário nº" + id + " está a " + anosDeEmpresa * 365 + " dias na empresa.");

		// Número de viagens
		System.out.println("O funcionário nº" + id + " fez " + numeroDeVoos / 2 + " viagens.");

		// Pontos por real
		System.out.println("O funcionário nº" + id + " fez R$" + pontosAcumulados / vendasAcumuladas
				+ " para cada ponto acumulado.");
		System.out.println("O funcionário nº" + id + " ganha R$" + salario + " mensais.");
		System.out.println("O funcionário nº" + id + " está de férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
