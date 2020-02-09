package br.com.cod3r.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.excecao.SairException;
import br.com.cod3r.cm.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner scanner = new Scanner(System.in);

	

	
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;
			
			while(continuar) {
				cicloDoJogo();
				
				System.out.println("Outra partida? (S/n)");
				String resposta = scanner.nextLine();
				
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
		} catch (SairException e) {
			System.out.println("Fim de Jogo.");
		} finally {
			scanner.close();
		}
	}

	private void cicloDoJogo() {
		try {
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado("Digite (x,y)/sair: ");
				Iterator<Integer> xY = Arrays.stream(digitado.split(","))
					.map(e -> Integer.parseInt(e.trim()))
					.iterator();
				digitado = capturarValorDigitado("1- Abrir ou 2 - (Des)Marcar: ");
				
				if("1".equals(digitado)) {
					tabuleiro.abrir(xY.next(), xY.next());
				} else if("2".equals(digitado)) {
					tabuleiro.alternarMarcacao(xY.next(), xY.next());
				}
				
			}
			System.out.println(tabuleiro);
			System.out.println("Você ganhou.");
		} catch(ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Você perdeu.");
		}
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String digitado = scanner.nextLine();
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		return digitado;
	}
}
