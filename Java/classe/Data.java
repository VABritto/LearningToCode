package classe;

public class Data {
	int dia, mes, ano;
	
	// VALORES PADR�ES:
	// byte, short, int, long -> 0
	// float, double -> 0.0
	// boolean -> false
	// char -> '\u0000'
	// Objetos -> null
	
	Data ()	{
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970); // Uso do this como m�todo. S� funciona dentro 
						  // de construtores.
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia; // Assim voc� pode acessar a vari�vel acima.
		this.mes = mes;
		this.ano = ano;
	}

	String dataString() {
		String diaFormatado, mesFormatado;
		if (dia < 10) {
			diaFormatado = "0" + this.dia; // Tamb�m � v�lido usar o this aqui.
		} else {						   // S� n�o o � quando o m�todo � static.
			diaFormatado = "" + dia;
		}
		if (mes < 10) {
			mesFormatado = "0" + mes;
		} else {
			mesFormatado = "" + mes;
		}
		final String formato = "%s/%s/%d";
		return String.format(formato, diaFormatado, mesFormatado, ano);
	}
}
