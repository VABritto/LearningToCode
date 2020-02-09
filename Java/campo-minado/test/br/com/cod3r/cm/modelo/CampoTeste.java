package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excecao.ExplosaoException;

class CampoTeste {

	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo(3, 2);
		boolean result = campo.adicionarVizinho(vizinho);
		assertTrue(result);
	}

	@Test
	void testeVizinhoDistancia1Direita() {
		Campo vizinho = new Campo(3, 4);
		boolean result = campo.adicionarVizinho(vizinho);
		assertTrue(result);
	}

	@Test
	void testeVizinhoDistancia1Encima() {
		Campo vizinho = new Campo(2, 3);
		boolean result = campo.adicionarVizinho(vizinho);
		assertTrue(result);
	}

	@Test
	void testeVizinhoDistancia1Embaixo() {
		Campo vizinho = new Campo(4, 3);
		boolean result = campo.adicionarVizinho(vizinho);
		assertTrue(result);
	}
	
	@Test
	void testeVizinhoDistancia2() {
		Campo vizinho = new Campo(2, 2);
		boolean result = campo.adicionarVizinho(vizinho);
		assertTrue(result);
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(1, 1);
		boolean result = campo.adicionarVizinho(vizinho);
		assertFalse(result);
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}

	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.minar();
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
	}
	
	@Test
	void testeAbrirComVizinho1() {
		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);
		
		campo22.adicionarVizinho(campo11);
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}

	@Test
	void testeAbrirComVizinho2() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);
		campo12.minar();
		
		Campo campo22 = new Campo(2, 2);
		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
	
	@Test
	void testeMinasNaVizinhanca() {
		
		Campo campo22 = new Campo(2, 2);
		campo22.minar();
		
		Campo campo32 = new Campo(3, 2);
		campo32.minar();
		
		Campo campo34 = new Campo(3, 4);
		
		campo.adicionarVizinho(campo22);
		campo.adicionarVizinho(campo32);
		campo.adicionarVizinho(campo34);
		
		assertEquals(2, campo.minasNaVizinhanca());
	}
	
	@Test
	void testeReiniciar() {
		campo.minar();
		
		Campo campo34 = new Campo(3, 4);
		campo34.alternarMarcacao();
		
		Campo campo32 = new Campo(3, 2);
		campo32.abrir();
		
		campo32.reiniciar();
		campo.reiniciar();
		campo34.reiniciar();
		
		assertTrue(!campo.isMinado() && !campo34.isMarcado() && campo32.isFechado());
	}
	
	@Test
	void testeToString() {
		Campo campo32 = new Campo(3, 2);
		Campo campo34 = new Campo(3, 4);
		Campo campo43 = new Campo(4, 3);
		Campo campo23 = new Campo(2, 3);
		
		campo.adicionarVizinho(campo32);
		campo.adicionarVizinho(campo34);
		campo.adicionarVizinho(campo43);
		campo.adicionarVizinho(campo23);
		
		assertEquals("?", campo.toString());
		assertEquals("?", campo32.toString());
		assertEquals("?", campo34.toString());
		assertEquals("?", campo43.toString());
		assertEquals("?", campo23.toString());
		
		campo32.alternarMarcacao();
		
		campo.abrir();
		
		assertTrue(campo34.isAberto());
		
		assertEquals(" ", campo.toString());
		assertEquals("x", campo32.toString());
		assertEquals(" ", campo34.toString());
		assertEquals(" ", campo43.toString());
		assertEquals(" ", campo23.toString());
		
	}
}
