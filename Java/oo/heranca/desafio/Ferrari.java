package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	Ferrari() {
		this(315);
		setDelta(15);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	@Override
	public boolean acelerar() {
		if (super.acelerar() == true) {
			System.out.println("\nA Ferrari acelera...");
			System.out.printf("A Ferrari está a %dkm/h.\n", velocidadeAtual);
			return true;
		} else {
			System.out.printf("\nLimite de velocidade alcançada. Ferrari a %dkm/h.\n"
					, velocidadeAtual);
			return false;
		}
	}
	
	@Override
	public boolean frear() {
		if (super.frear() == true) {
			System.out.println("\nA Ferrari freia...");
			System.out.printf("A Ferrari está a %dkm/h.\n", velocidadeAtual);
			return true;
		} else {
			System.out.println("\nA Ferrari está parada.");
			return false;
		}
	}
	
	@Override
	public void ligarTurbo() {
		System.out.println("A Ferrari ligou o turbo.");
		setDelta(35);
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		System.out.println("A Ferrari desligou o turbo.");
		setDelta(15);
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		System.out.println("A Ferrari ligou o ar.");
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		System.out.println("A Ferrari desligou o ar.");
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		}else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
}
