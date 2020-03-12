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

import com.qintess.desafio.modelo.DadosMercado;
import com.qintess.desafio.modelo.Operacoes;
import com.qintess.desafio.modelo.Subproduto;

public class ExecutaArquivo {

	public static long startTime = System.nanoTime();

	public static List<Subproduto> listaSubproduto = new ArrayList<Subproduto>();
	public static List<DadosMercado> listaDadosMercado = new ArrayList<>();
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

		Scanner scDadosMercado = new Scanner(enderecoDadosMercado);
		scDadosMercado.nextLine(); // Tirar cabecalho.
			while (scDadosMercado.hasNext()) {
					String[] colunas = scDadosMercado.nextLine().split(";");
					int idPreco = Integer.parseInt(colunas[0]);
					long nuPrazoDiasCorridos = Long.parseLong(colunas[1]);
					double vlPreco = Double.parseDouble(colunas[2].replace(",", "."));
					
					DadosMercado dadosMercado = new DadosMercado(idPreco, nuPrazoDiasCorridos, vlPreco);
					
					listaDadosMercado.add(dadosMercado);
			}
			
			for (Subproduto sp: listaSubproduto) {
				for (Operacoes op: sp.getListaOperacoes()) {
					for (DadosMercado dm: listaDadosMercado) {
						if (dm.getIdPreco() == op.getIdPreco() && dm.getNuPrazoDiasCorridos() == op.getNuPrazoDiasCorridos()) {
							sp.setResultado(dm.getVlPreco(), op.getQuantidade());
							break;
						}
					}
				}
			}
			
		for (Subproduto sp: listaSubproduto) {
		escritor.append(sp.getNmSubproduto() + ";");	
		escritor.append(sp.getResultado() + ";");
		escritor.append("\n");
		}
				
		System.out.println("Foi.");

		escritor.flush();
		escritor.close();
		scOperacoes.close();
		scDadosMercado.close();
		long endTime = System.nanoTime();
		long totalTime = (endTime - startTime) / 1_000_000_000;
		System.out.println("Tempo total em segundos: " + totalTime + "s.\nTempo total em minutos: " + (totalTime / 60));
	}
}
