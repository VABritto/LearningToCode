package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class CarroTeste {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari(310);
		Fusca fusca = new Fusca(100);
		
		fusca.acelerar();

		ferrari.acelerar();
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.desligarTurbo();
		ferrari.acelerar();
		ferrari.ligarAr();
		ferrari.acelerar();
		ferrari.desligarAr();
		ferrari.acelerar();
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		System.out.println(ferrari.velocidadeDoAr());
		ferrari.acelerar();
		ferrari.desligarTurbo();
		ferrari.desligarAr();
		System.out.println(ferrari.velocidadeDoAr());
		ferrari.acelerar();
		
		
		
		
	}
}
