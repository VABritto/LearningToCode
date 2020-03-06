package com.qintess.banco.modelo;

public class Transferencia {

	public void transferir (Conta transferidora, Conta transferida, double valor) {
		transferidora.transferir(valor);
		transferida.depositar(valor);
	}
}
