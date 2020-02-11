package oo.heranca.desafio;

public class Fusca extends Carro {
	
	public Fusca (int velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	
	@Override
	public boolean acelerar() {
		if (super.acelerar() == true) {
			System.out.println("\nO Fusca acelera...");
			super.acelerar();
			System.out.printf("O Fusca est� a %dkm/h.\n", velocidadeAtual);
			return true;
		} else {
			System.out.printf("\nLimite de velocidade alcan�ada. Fusca a %dkm/h.\n"
					, velocidadeAtual);
			return false;
		}
	}
	
	@Override
	public boolean frear() {
		if (super.frear() == true) {
			System.out.println("\nO Fusca freia...");
			System.out.printf("O Fusca est� a %dkm/h.\n", velocidadeAtual);
			return true;
		} else {
			System.out.println("\nO Fusca est� parado.");
			return false;
		}
	}
}
