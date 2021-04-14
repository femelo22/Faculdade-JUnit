package src.junit.loteriaV2;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import util.RandomNumbers;

public class LoteriaTest extends TestCase {

	private Loteria loteria;

	public void setUp() {
		loteria = new Loteria();
	}

	@Test
	public void testLoteria_Sena() {

		List<Integer> apostados = Arrays.asList(1, 2, 3, 4, 5, 6);

		List<Integer> sorteados = Arrays.asList(1, 2, 3, 9, 10, 11);

		assertEquals(0.0, loteria.calcularPremio(apostados, sorteados, 100));
	}

	@Test
	public void testAposta_AcimaMaximaIgual() {

		List<Integer> apostados = Arrays.asList(1, 2, 3, 4, 5, 6);

		List<Integer> sorteados = Arrays.asList(1, 2, 3, 9, 10, 11);

		assertEquals(0.0, loteria.calcularPremio(apostados, sorteados, 100));
	}

}
