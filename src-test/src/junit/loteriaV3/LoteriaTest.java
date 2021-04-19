package src.junit.loteriaV3;

import java.util.Arrays;

import junit.framework.TestCase;

public class LoteriaTest extends TestCase {

	Loteria loteria;

	public void setUp() {
		loteria = new Loteria();
	}

	public void testCalcularAposta_ApostaInvalida() {
		try {

			Sorteio sorteio = new Sorteio(6);
			
			Loteria loteria = new Loteria();

			loteria.calcularPremio(null, sorteio, 0.0);

			fail();

		} catch (IllegalArgumentException e) {
			assertEquals("Aposta inválida", e.getMessage());
		}

	}

	public void testCalcularAposta_SorteioInvalido() {
		try {

			Loteria loteria = new Loteria();

			Aposta aposta = new Aposta(Arrays.asList(1, 2, 3, 4, 5, 6));

			loteria.calcularPremio(aposta, null, 0.0);

			fail();

		} catch (IllegalArgumentException e) {
			assertEquals("Sorteio inválido", e.getMessage());
		}

	}

	public void testCalcularAposta_Sena() {

		Loteria loteria = new Loteria();

		Sorteio sorteio = new Sorteio(6);

		Aposta aposta = new Aposta(sorteio.getNumeros());

		assertEquals(100 * 100, loteria.calcularPremio(aposta, sorteio, 100));
	}
	
	public void testCalcularAposta_Quina() {

		Loteria loteria = new Loteria();

		Sorteio sorteio = new Sorteio(6);

		Aposta aposta = new Aposta(sorteio.getNumeros());

		assertEquals(100 * 0.2, loteria.calcularPremio(aposta, sorteio, 100));
	}
	
	public void testCalcularAposta_Quadra() {

		Loteria loteria = new Loteria();

		Sorteio sorteio = new Sorteio(6);

		Aposta aposta = new Aposta(sorteio.getNumeros());

		assertEquals(100 * 0.05, loteria.calcularPremio(aposta, sorteio, 100));
	}
	
	public void testCalcularAposta_SemAcertos() {

		Loteria loteria = new Loteria();

		Sorteio sorteio = new Sorteio(6);

		Aposta aposta = new Aposta(sorteio.getNumeros());

		assertEquals(0.0, loteria.calcularPremio(aposta, sorteio, 100));
	}

}
