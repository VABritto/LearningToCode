package com.qintess.banco.modelo;

public class VerificarSenha {
	
	public boolean verificarSenha(String senha1, String senha2) {
		
		if (senha1.equals(senha2)) {
			return true;
		} else {
			return false;
		}
	}
}
