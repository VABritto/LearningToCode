package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class Campo {
	
	private boolean aberto = false;
	private boolean marcado = false;
	private boolean minado = false;
	
	private final int coluna;
	private final int linha;
	
	private List<Campo> vizinhos = new ArrayList<Campo>();
	
	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo possivelVizinho) {
		boolean linhaDiferente = linha != possivelVizinho.linha;
		boolean colunaDiferente = coluna != possivelVizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - possivelVizinho.linha); 
		int deltaColuna = Math.abs(coluna - possivelVizinho.coluna);
		int deltaGeral = deltaLinha + deltaColuna;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(possivelVizinho);
			return true;
		} else if(deltaGeral == 2 && diagonal) {
			vizinhos.add(possivelVizinho);
			return true;
		} else {
			return false;
		}
	}
	
	void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
		}
	}
	
	boolean abrir() {
		
		if(!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				throw new ExplosaoException();
			}
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(vizinho -> vizinho.abrir());
			}
			return true;

		} else {
			return false;
		}
	}
	
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(vizinho -> vizinho.minado);
	}
	
	void minar() {
		minado = true;
	}
	
	public boolean isMarcado() {
		return marcado;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public boolean isAberto() {
		return aberto;
	}

	public boolean isFechado() {
		return !isAberto();
	}
	
	public boolean isMinado() {
		return minado;
	}

	public int getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}
	
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}
	
	long minasNaVizinhanca() {
		return vizinhos.stream().filter(vizinho -> vizinho.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	public String toString() {
		if(marcado) {
			return "x";
		} else if(aberto && minado) {
			return "*";
		} else if(aberto && minasNaVizinhanca() > 0) {
			return Long.toString(minasNaVizinhanca());
		} else if(aberto) {
			return " ";
		} else {
			return "?";
		}
	}
}
