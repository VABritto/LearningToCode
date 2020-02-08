package oo.heranca;

public class Heroi extends Jogador {
	
	public Heroi(String name, int x, int y) {
		super(name, x, y);
	}
	
	public boolean atacar (Jogador oponente) {
		if (super.atacar(oponente) == true) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}
	
}
