import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculoSimplesTest {

	@Test
	void testSoma() {
		CalculoSimples calculoSimples = new CalculoSimples();
		assertEquals(4,calculoSimples.soma(2, 2));
	}
	
	@Test
	void testSomaLimite() {
		CalculoSimples calculoSimples = new CalculoSimples();
		assertEquals(4,calculoSimples.soma(2, 2));
	}
	
	@Test
	void testNumerosIguais() {
		CalculoSimples calculoSimples = new CalculoSimples();
		assertTrue(calculoSimples.numerosIguais(5, 5));
	}
	
	@Test
	void testNumerosDiferentes() {
		CalculoSimples calculoSimples = new CalculoSimples();
		assertFalse(calculoSimples.numerosIguais(5, 7));
	}
	
	@Test
	void testObjetosIguais() {
		CalculoSimples calculoSimples = new CalculoSimples();
		//SomaSimples somaSimples = new SomaSimples();
		assertSame(calculoSimples, calculoSimples);
	}

	@Test
	void testSubtrai() {
		CalculoSimples calculoSimples = new CalculoSimples();
		assertEquals(4,calculoSimples.subtrai(6, 2));
	}

}
