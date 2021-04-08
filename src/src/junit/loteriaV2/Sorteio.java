package src.junit.loteriaV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio {
	
	private static final int MAIOR_NUMERO_SORTEIO = 59; 
	private static final int QTDE_NUMEROS_SORTEIO = 6;
	
	
	private static List<Integer> sortearNumeros() {
		List<Integer> sorteados = new ArrayList<>();
		int numeroSorteado;
		while (sorteados.size() < QTDE_NUMEROS_SORTEIO) {
			numeroSorteado = new Random().nextInt(MAIOR_NUMERO_SORTEIO) + 1;
			if (!sorteados.contains(numeroSorteado)) {
				sorteados.add(numeroSorteado);
			}
		}
		return sorteados;
	}

}
