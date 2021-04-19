package src.junit.loteriaV2;

import java.util.List;

public class LoteriaV2 {
	
	public static final int NUM_ACERTOS_SENA = 6;
	public static final int NUM_ACERTOS_QUINA = 5;
	public static final int NUM_ACERTOS_QUADRA = 4;
	public static final double PERC_PREMIO_SENA = 1.0;
	public static final double PERC_PREMIO_QUINA = 0.2;
	public static final double PERC_PREMIO_QUADRA = 0.05;
	

	public double calcularPremio(List<Integer> apostados, List<Integer> sorteados, double premioTotal) {
		
		//Aposta aposta = new Aposta();
		
		//aposta.validarAposta(apostados);
		
		int acertos = this.calcularAcertos(apostados, sorteados);

		if (acertos == NUM_ACERTOS_SENA) {
			return premioTotal * PERC_PREMIO_SENA;
		} else if (acertos == NUM_ACERTOS_QUINA) {
			return premioTotal * PERC_PREMIO_QUINA;
		} else if (acertos == NUM_ACERTOS_QUADRA) {
			return premioTotal * PERC_PREMIO_QUADRA;
		} else {
			return 0.0;
		}
	}
	
	
	protected int calcularAcertos(List<Integer> apostados, List<Integer> sorteados) {
		int acertos = 0;
		for (Integer apostado : apostados) {
			if (sorteados.contains(apostado)) {
				acertos++;
			}
		}
		return acertos;
	}

}