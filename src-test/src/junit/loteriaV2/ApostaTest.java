package src.junit.loteriaV2;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.TestCase;

/*public class ApostaTest extends TestCase {

	private Aposta aposta;

	public void setUp() {
		aposta = new Aposta();
	}

	@Test
	public void testAposta_AbaixoMinima() {
		try {
			aposta.validarAposta(Arrays.asList(1, 2, 3, 4, 5));

			fail();

		} catch (IllegalArgumentException e) {

			assertEquals("A aposta abaixo da mínima", e.getMessage());
		}
	}

	@Test
	public void testAposta_AcimaMaxima() {
		try {
			aposta.validarAposta(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16));

			fail();

		} catch (IllegalArgumentException e) {

			assertEquals("A aposta acima da máxima", e.getMessage());
		}
	}

	@Test
	public void testAposta_NumeroForaLimiteMenor() {
		try {
			aposta.validarAposta(Arrays.asList(0, 1, 2, 3, 4, 5, 6));

			fail();

		} catch (IllegalArgumentException e) {

			assertEquals("Número fora do limite", e.getMessage());
		}
	}

	@Test
	public void testAposta_NumeroForaLimiteMaior() {
		try {
			aposta.validarAposta(Arrays.asList(1, 2, 3, 4, 5, 61));

			fail();

		} catch (IllegalArgumentException e) {

			assertEquals("Número fora do limite", e.getMessage());
		}
	}

	@Test
	public void testAposta_NumeroDuplicado() {
		try {
			aposta.validarAposta(Arrays.asList(1, 2, 2, 3, 4, 5, 61));

			fail();

		} catch (IllegalArgumentException e) {

			assertEquals("Número duplicado", e.getMessage());
		}
	}

	@Test
	public void testAposta_Valida() {

		try {
			aposta.validarAposta(Arrays.asList(1, 2, 6, 3, 4, 5, 60));
			
		} catch (IllegalArgumentException e) {
			fail();
		}
	}

}*/
