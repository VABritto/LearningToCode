package com.qintess.banco.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Caixa {

	public static List<Conta> contas = new ArrayList<Conta>();
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		PainelDeControle painel = new PainelDeControle();
		painel.painelDeControle(contas);
		scanner.close();
	
	}	
		
	
}
