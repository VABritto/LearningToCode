package com.qintess.desafio.executa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.qintess.desafio.modelo.Operacoes;
import com.qintess.desafio.modelo.Subproduto;

public class ExecutaTeste {

	public static long startTime = System.nanoTime();

	public static List<Subproduto> listaSubproduto = new ArrayList<Subproduto>();
	public static void main(String[] args) throws FileNotFoundException, ParseException, IOException {

		File enderecoDadosMercado = new File("C:\\eclipse-workspace\\Java_Estagio\\src\\DadosMercado.csv");
		File enderecoOperacoes = new File("C:\\eclipse-workspace\\Java_Estagio\\src\\Operacoes.csv");
		String formatoData = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(formatoData, Locale.getDefault());
		FileWriter escritor = new FileWriter("C:\\eclipse-workspace\\Java_Estagio\\src\\Resultados.csv");

		Scanner scOperacoes = new Scanner(enderecoOperacoes);

		scOperacoes.nextLine(); // Consumir os cabeçalhos.
		
		escritor.append("NM_SUBPRODUTO;RESULTADO\n");
		while (scOperacoes.hasNext()) {
			String[] colunasO = scOperacoes.nextLine().split(";");

			String data1 = colunasO[1];
			String data2 = colunasO[2];
			Date dtInicio = sdf.parse(data1);
			Date dtFim = sdf.parse(data2);
			String nmSubproduto = colunasO[9];
			
			double quantidade = Double.parseDouble(colunasO[12].replace(",", "."));
			int idPrecoO = Integer.parseInt(colunasO[13]);
			
			Operacoes operacoes = new Operacoes(dtInicio, dtFim, quantidade, idPrecoO);
			
			Subproduto subproduto = new Subproduto(nmSubproduto, operacoes);
			
			if (listaSubproduto.isEmpty()) {
				listaSubproduto.add(subproduto);
			} else if (!listaSubproduto.contains(subproduto)) {
				listaSubproduto.add(subproduto);
			} else {
				for (Subproduto sp: listaSubproduto) {
					if (sp.getNmSubproduto().equals(subproduto.getNmSubproduto())) {
						sp.setListaOperacoes(operacoes);
					}
				}
			}
			
		}

		for (Subproduto sp: listaSubproduto) {
			escritor.append(sp.getNmSubproduto() + ";");
			Scanner scDadosMercado = new Scanner(enderecoDadosMercado);
			scDadosMercado.nextLine(); // Consumir os cabeçalhos.
		
			while (scDadosMercado.hasNext()) {
				String[] colunasDM = scDadosMercado.nextLine().split(";");
				int idPrecoDM = Integer.parseInt(colunasDM[0]);
				long nuPrazoDiasCorridosDM = Long.parseLong(colunasDM[1]);
				double vlPreco = Double.parseDouble(colunasDM[2].replace(",", "."));
				
					for (Operacoes op: sp.getListaOperacoes()) {
						if (idPrecoDM == op.getIdPreco() && nuPrazoDiasCorridosDM == op.getNuPrazoDiasCorridos()) {
							sp.setResultado(vlPreco, op.getQuantidade());
						}
					}
					
				}
				escritor.append(sp.getResultado() + ";");
				escritor.append("\n");
				scDadosMercado.close();
			}
		
//				DadosMercado dadosMercado = new DadosMercado(idPrecoDM, nuPrazoDiasCorridosDM, vlPreco);
//				
//				listaDadosMercado.add(dadosMercado);

				
		System.out.println("Foi.");

		escritor.flush();
		escritor.close();
		scOperacoes.close();

		long endTime = System.nanoTime();
		long totalTime = (endTime - startTime) / 1_000_000_000;
		System.out.println("Tempo total em segundos: " + totalTime + "s.\nTempo total em minutos: " + (totalTime / 60));
	}
}
