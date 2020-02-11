package classe;

public class Data {
	int dia, mes, ano;
	
	// VALORES PADRÕES:
	// byte, short, int, long -> 0
	// float, double -> 0.0
	// boolean -> false
	// char -> '\u0000'
	// Objetos -> null
	
	Data ()	{
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970); // Uso do this como método. Só funciona dentro 
						  // de construtores.
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia; // Assim você pode acessar a variável acima.
		this.mes = mes;
		this.ano = ano;
	}

	String dataString() {
		String diaFormatado, mesFormatado;
		if (dia < 10) {
			diaFormatado = "0" + this.dia; // Também é válido usar o this aqui.
		} else {						   // Só não o é quando o método é static.
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
