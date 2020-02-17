package br.com.britto.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.britto.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener{

	private final Color CINZA_ESCURO = new Color(68, 68, 68);
	private final Color CINZA_CLARO = new Color(99, 99, 99);
	private final Color LARANJA = new Color(242, 163, 60);
	public Teclado() {
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		
		setLayout(layout);
		
		constraints.weightx = 1;
		constraints.weighty = 1;
		constraints.fill = GridBagConstraints.BOTH;
		
		// Linha 1.
		adicionarBotao("AC", CINZA_ESCURO, constraints, 0, 0);
		adicionarBotao("±", CINZA_ESCURO, constraints, 1, 0);
		adicionarBotao("%", CINZA_ESCURO, constraints, 2, 0);
		adicionarBotao("÷", LARANJA, constraints, 3, 0);

		// Linha 2.
		adicionarBotao("7", CINZA_CLARO, constraints, 0, 1);
		adicionarBotao("8", CINZA_CLARO, constraints, 1, 1);
		adicionarBotao("9", CINZA_CLARO, constraints, 2, 1);
		adicionarBotao("×", LARANJA, constraints, 3, 1);
		
		// Linha 3.
		adicionarBotao("4", CINZA_CLARO, constraints, 0, 2);
		adicionarBotao("5", CINZA_CLARO, constraints, 1, 2);
		adicionarBotao("6", CINZA_CLARO, constraints, 2, 2);
		adicionarBotao("-", LARANJA, constraints, 3, 2);
		
		// Linha 4.
		adicionarBotao("1", CINZA_CLARO, constraints, 0, 3);
		adicionarBotao("2", CINZA_CLARO, constraints, 1, 3);
		adicionarBotao("3", CINZA_CLARO, constraints, 2, 3);
		adicionarBotao("+", LARANJA, constraints, 3, 3);
		
		// Linha 5.
		constraints.gridwidth = 2;
		adicionarBotao("0", CINZA_CLARO, constraints, 0, 4);
		constraints.gridwidth = 1;
		adicionarBotao(",", CINZA_CLARO, constraints, 2, 4);
		adicionarBotao("=", LARANJA, constraints, 3, 4);
	}
	private void adicionarBotao(String texto, Color cor, 
			GridBagConstraints constraints, int x, int y) {
		
		constraints.gridx = x;
		constraints.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, constraints);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() instanceof JButton) {
			JButton botao = (JButton) evento.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}
	}
}
