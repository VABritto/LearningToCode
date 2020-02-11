package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Heroi heroi = new Heroi("Heroi", 10, 10);
		
		Monstro monstro = new Monstro("Monstro", 10, 11);
		
		System.out.printf("\n==============={ %s }\nPV: %d\n",heroi.name, heroi.vida);
		System.out.printf("Coordenadas: x:%d, y:%d.\n================" 
						+ "========", heroi.x, heroi.y);
		System.out.printf("\n============={ %s }\nPV: %d\n", monstro.name, monstro.vida);
		System.out.printf("Coordenadas: x:%d, y:%d.\n================" 
				+ "========", monstro.x, monstro.y);		
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);

		monstro.andar(Direcao.NORTE);
		heroi.atacar(monstro);
		monstro.andar(Direcao.SUL);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		
		
		System.out.printf("\n==============={ %s }\nPV: %d\n",heroi.name, heroi.vida);
		System.out.printf("Coordenadas: x:%d, y:%d.\n================" 
				+ "========", heroi.x, heroi.y);
		System.out.printf("\n============={ %s }\nPV: %d\n", monstro.name, monstro.vida);
		System.out.printf("Coordenadas: x:%d, y:%d.\n================" 
				+ "========", monstro.x, monstro.y);		
	}
}
