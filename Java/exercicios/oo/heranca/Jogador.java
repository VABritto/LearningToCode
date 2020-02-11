package oo.heranca;

public class Jogador {
	
	public String name;
	public int vida = 100;
	public int x;
	public int y;
	
	protected Jogador (String name, int x, int y)	{
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar(Jogador oponente) {

		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);

		System.out.printf("\nO %s ataca o %s...\n", name, oponente.name);
		if (oponente.vida <= 0) {
			System.out.printf("\nO %s está morto!\n", oponente.name);
			return false;
		} else if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			System.out.printf("\nO %s acerta o %s!\n", name, oponente.name);
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			System.out.printf("\nO %s acerta o %s!\n", name, oponente.name);
			return true;
		} else {
			System.out.printf("\nO %s erra!\n", name);
			return false;
		}
	}
	
	public boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y++;
			System.out.printf("\nO %s andou 1 passo para o norte.\n", name);
			break;
		case SUL:
			y--;
			System.out.printf("\nO %s andou 1 passo para o sul.\n", name);
			break;
		case LESTE:
			x++;
			System.out.printf("\nO %s andou 1 passo para o leste.\n", name);
			break;
		case OESTE:
			x--;
			System.out.printf("\nO %s andou 1 passo para o oeste.\n", name);
			break;
		}
		return true;
	}
	
}
