package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es do funcion�rio

		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;

		// Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipo booleano
		boolean estaDeFerias = false; // Ou true

		// Tipo caractere (S� usa um caractere)
		char status = 'A'; // Ativo; backdash e a letra u mais o numero representa um caractere de unicode

		// Dias de empresa
		System.out.println("O funcion�rio n�" + id + " est� a " + anosDeEmpresa * 365 + " dias na empresa.");

		// N�mero de viagens
		System.out.println("O funcion�rio n�" + id + " fez " + numeroDeVoos / 2 + " viagens.");

		// Pontos por real
		System.out.println("O funcion�rio n�" + id + " fez R$" + pontosAcumulados / vendasAcumuladas
				+ " para cada ponto acumulado.");
		System.out.println("O funcion�rio n�" + id + " ganha R$" + salario + " mensais.");
		System.out.println("O funcion�rio n�" + id + " est� de f�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
