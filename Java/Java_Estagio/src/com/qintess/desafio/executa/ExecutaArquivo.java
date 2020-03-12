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

public class ExecutaArquivo {

//	public static List<Resultado> resultados = new ArrayList<Resultado>();
//	public static List<Operacoes> listaOperacoes = new ArrayList<Operacoes>();
//	public static List<DadosMercado> listaDadosMercado = new ArrayList<DadosMercado>();
//
//	public static void main(String[] args) throws FileNotFoundException, ParseException {
//
//		File enderecoDadosMercado = new File("C:\\eclipse-workspace\\Java_Estagio\\src\\DadosMercado.csv");
//		File enderecoOperacoes = new File("C:\\eclipse-workspace\\Java_Estagio\\src\\Operacoes.csv");
//		String formatoData = "dd/MM/yyyy";
//		SimpleDateFormat sdf = new SimpleDateFormat(formatoData, Locale.getDefault());
//		
//
//		Scanner scDadosMercado = new Scanner(enderecoDadosMercado);
//		Scanner scOperacoes = new Scanner(enderecoOperacoes);
//		
//		scOperacoes.nextLine(); // Consumir os cabeçalhos.
//		scDadosMercado.nextLine(); // Consumir os cabeçalhos.
//		
//
//		while (scOperacoes.hasNext()) {
//			String[] colunas = scOperacoes.nextLine().split(";");
//			
//			long cdOperacao = Long.parseLong(colunas[0]);
//			String data1 = colunas[1];
//			String data2 = colunas[2];
//			Date dtInicio = sdf.parse(data1);
//			Date dtFim = sdf.parse(data2);
//			String nmEmpresa = colunas[3];
//			String nmMesa = colunas[4];
//			String nmEstrategia = colunas[5];
//			String nmCentralizador = colunas[6];
//			String nmGestor = colunas[7];
//			String nmSubgestor = colunas[8];
//			String nmSubproduto = colunas[9];
//			String nmCaracteristica = colunas[10];
//			String cdAtivoObjeto = colunas[11];
//			double quantidade = Double.parseDouble(colunas[12].replace(",", "."));
//			long idPreco = Long.parseLong(colunas[13]);
//			
//			Operacoes operacoes = new Operacoes(cdOperacao, dtInicio, dtFim, 
//					nmEmpresa, nmMesa, nmEstrategia, nmCentralizador, nmGestor, 
//					nmSubgestor, nmSubproduto, nmCaracteristica, cdAtivoObjeto,
//					quantidade, idPreco);
//			
//			listaOperacoes.add(operacoes);
//			
//		}
//		
//		while (scDadosMercado.hasNext()) {
//			String[] colunas = scDadosMercado.nextLine().split(";");
//			long idPreco = Long.parseLong(colunas[0]);
//			long nuPrazoDiasCorridos = Long.parseLong(colunas[1]);
//			double vlPreco = Double.parseDouble(colunas[2].replace(",", "."));
//			
//			DadosMercado dadosMercado = new DadosMercado(idPreco, nuPrazoDiasCorridos, vlPreco);
//			
//			listaDadosMercado.add(dadosMercado);
//			
//		}
//		
//		for (int i = 0; i < listaDadosMercado.size(); i++) {
//			for (int j = 0; j < listaOperacoes.size(); j++) {
//				if (listaDadosMercado.get(i).getIdPreco() 
//						== listaOperacoes.get(j).getIdPreco() 
//						&& listaDadosMercado.get(i).getNuPrazoDiasCorridos()
//						== listaOperacoes.get(j).getNuPrazoDiasCorridos()) {
//					DadosMercado dadosMercado = listaDadosMercado.get(i);
//					Operacoes operacoes = listaOperacoes.get(j);
//					Resultado resultado = new Resultado(dadosMercado, operacoes);
//					resultados.add(resultado);
//				}
//			}
//		}
//		
//		System.out.println(resultados.get(0).getOperacoes().getNuPrazoDiasCorridos());
//
//		scDadosMercado.close();
//		scOperacoes.close();
//	}
}
