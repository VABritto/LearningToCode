package oo.heranca.desafio;

public class Carro {
	protected final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual = 0;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public boolean acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
			return false;
		} else {
			velocidadeAtual += getDelta();
			return true;
		}
	}
	
	public boolean frear() {
		if (velocidadeAtual >= getDelta()) {
			velocidadeAtual -= getDelta();
			return true;
		} else {
			velocidadeAtual = 0;
			return false;
		}
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}
