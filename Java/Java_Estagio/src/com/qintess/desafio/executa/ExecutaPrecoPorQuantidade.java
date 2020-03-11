package com.qintess.desafio.executa;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.qintess.desafio.modelo.DadosMercado;
import com.qintess.desafio.modelo.Operacoes;
import com.qintess.desafio.modelo.Resultado;

public class ExecutaPrecoPorQuantidade {

	public static List<Resultado> resultados = new ArrayList<>();
	public static List<Operacoes> listaOperacoes = new ArrayList<Operacoes>();
	public static List<DadosMercado> listaDadosMercado = new ArrayList<DadosMercado>();

	public static void main(String[] args) throws FileNotFoundException, ParseException {

		File enderecoDadosMercado = new File("C:\\eclipse-workspace\\Java_Estagio\\src\\DadosMercado.csv");
		File enderecoOperacoes = new File("C:\\eclipse-workspace\\Java_Estagio\\src\\Operacoes.csv");
		String formatoData = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(formatoData, Locale.getDefault());

		Scanner scDadosMercado = new Scanner(enderecoDadosMercado);
		Scanner scOperacoes = new Scanner(enderecoOperacoes);

		scOperacoes.nextLine(); // Consumir os cabeçalhos.
		scDadosMercado.nextLine(); // Consumir os cabeçalhos.

		while (scOperacoes.hasNext()) {
			String[] colunasO = scOperacoes.nextLine().split(";");

			String data1 = colunasO[1];
			String data2 = colunasO[2];
			Date dtInicio = sdf.parse(data1);
			Date dtFim = sdf.parse(data2);
			double quantidade = Double.parseDouble(colunasO[12].replace(",", "."));
			long idPrecoO = Long.parseLong(colunasO[13]);

			Operacoes operacoes = new Operacoes(dtInicio, dtFim, quantidade, idPrecoO);

			listaOperacoes.add(operacoes);

			while (scDadosMercado.hasNext()) {
				String[] colunasDM = scDadosMercado.nextLine().split(";");
				long idPrecoDM = Long.parseLong(colunasDM[0]);
				long nuPrazoDiasCorridosDM = Long.parseLong(colunasDM[1]);
				double vlPreco = Double.parseDouble(colunasDM[2].replace(",", "."));

				DadosMercado dadosMercado = new DadosMercado(idPrecoDM, nuPrazoDiasCorridosDM, vlPreco);

				listaDadosMercado.add(dadosMercado);

				for (int i = 0; i < listaDadosMercado.size(); i++) {
					for (int j = 0; j < listaOperacoes.size(); j++) {
						if (listaDadosMercado.get(i).getIdPreco() == listaOperacoes.get(j).getIdPreco()
								&& listaDadosMercado.get(i).getNuPrazoDiasCorridos() == listaOperacoes.get(j)
										.getNuPrazoDiasCorridos()) {
							DadosMercado dadosMercadoR = listaDadosMercado.get(i);
							Operacoes operacoesR = listaOperacoes.get(j);
							Resultado resultado = new Resultado(dadosMercadoR, operacoesR);
							resultados.add(resultado);
							System.out.println("Adicionado: " + resultados.indexOf(resultado));
						}
					}
				}
			}
		}

		System.out.println("Foi.");

		scDadosMercado.close();
		scOperacoes.close();
	}
}
