package src.junit.loteriaV1;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

public class LoteriaTest extends TestCase {

	private Loteria loteria;

	public void setUp() {
		loteria = new Loteria();
	}

	@Test
	public void testCalcularPremio_qtdNumerosApostadoInvalidoMinimo() {
		
		try {
			List<Integer> apostados = Arrays.asList(5, 6, 7, 4, 9); 
				
			loteria.validarAposta(apostados);
			
			fail();
			
		} catch (IllegalArgumentException e) {
			
			assertEquals("A aposta abaixo da mínima", e.getMessage());
		}

	}

	@Test
	public void testCalcularPremio_qtdNumerosApostadoInvalidoMaximo() {
		
		try {
			
			List<Integer> apostados = Arrays.asList(5, 6, 7, 4, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20); 
			
			loteria.validarAposta(apostados);
			
			fail();
			
		} catch (IllegalArgumentException e) {
			assertEquals("A aposta cima da máxima", e.getMessage());
		}
		
	}

	
	@Test
	public void testCalcularPremio_menorNumeroApostado() {
		
		try {
			List<Integer> apostados = Arrays.asList(5, 6, 7, 4, 9, 0);
			
			loteria.validarAposta(apostados);
			
			fail();
			
		} catch (IllegalArgumentException e) {
			assertEquals("Número fora do limite", e.getMessage());
		}

	}

	
	@Test
	public void testCalcularPremio_maiorNumeroApostado() {

		try {
			List<Integer> apostados = Arrays.asList(5, 6, 7, 4, 9, 61); 
			
			loteria.validarAposta(apostados);

			fail();
			
		} catch (IllegalArgumentException e) {
			assertEquals("Número fora do limite", e.getMessage());
		}
	}

	@Test
	public void testCalcularPremio_numeroApostadoDuplicado() {
		try {

			List<Integer> apostados = Arrays.asList(5, 6, 7, 4, 9, 10, 10);

			loteria.validarAposta(apostados);
			
			fail();

		} catch (IllegalArgumentException e) {

			assertEquals("Número duplicado", e.getMessage());
		}
	}
	
	
	@Test
	public void testCalcularPremio_acertarSena(){
		
		double premio;
		
		List<Integer> apostados = Arrays.asList(5, 6, 7, 4, 9, 10); 
		
		List<Integer> sorteados = Arrays.asList(5, 6, 7, 4, 9, 10);
		
		premio = loteria.calcularPremio(apostados, sorteados, 1000.00);
		
		assertEquals(1000.00, premio);
		
	}
	
	@Test
	public void testCalcularPremio_acertarQuina(){
		
		double premio;
		
		List<Integer> apostados = Arrays.asList(5, 6, 7, 4, 9, 10); 
		
		List<Integer> sorteados = Arrays.asList(5, 6, 7, 4, 9, 11);
		
		premio = loteria.calcularPremio(apostados, sorteados, 1000.00);
		
		assertEquals(200.00, premio);
		
	}
	
	
	@Test
	public void testCalcularPremio_acertarQuadra(){
		
		double premio;
		
		List<Integer> apostados = Arrays.asList(5, 6, 7, 4, 9, 10); 
		
		List<Integer> sorteados = Arrays.asList(5, 6, 7, 4, 8, 11);
		
		premio = loteria.calcularPremio(apostados, sorteados, 1000.00);
		
		assertEquals(50.00, premio);
		
	}
	
	@Test
	public void testCalcularPremio_semAcertos(){
		
		double premio;
		
		List<Integer> apostados = Arrays.asList(5, 6, 7, 4, 9, 10); 
		
		List<Integer> sorteados = Arrays.asList(5, 6, 7, 3, 8, 11);
		
		premio = loteria.calcularPremio(apostados, sorteados, 1000.00);
		
		assertEquals(00.00, premio);
		
	}

}
