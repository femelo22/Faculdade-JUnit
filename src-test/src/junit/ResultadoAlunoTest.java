package src.junit;

import junit.framework.TestCase;

public class ResultadoAlunoTest extends TestCase{

	ResultadoAluno aluno;
	
	public void setUp() {
		aluno = new ResultadoAluno();
	}
	
	public void testResultadoAluno_frequencia() {
		aluno.setFrequencia(74);
		assertFalse(aluno.calcularResultadoAluno());
	}
	
	public void testResultadoAluno_reprovadoAbaixoMedia() {
		aluno.setFrequencia(75);
		aluno.setNota1(29);
		aluno.setNota2(30);
		assertFalse(aluno.calcularResultadoAluno());
	}
	
	public void testResultadoAluno_aprovadoAcimaMedia() {
		aluno.setFrequencia(75);
		aluno.setNota1(70);
		aluno.setNota2(70);
		assertTrue(aluno.calcularResultadoAluno());
	}
	
	public void testResultadoAluno_aprovadoRecuperacao() {
		aluno.setFrequencia(75);
		aluno.setNota1(30);
		aluno.setNota2(30);
		aluno.setNotaFinal(70);
		assertTrue(aluno.calcularResultadoAluno());
	}
	
	public void testResultadoAluno_reprovadoRecuperacao() {
		aluno.setFrequencia(75);
		aluno.setNota1(30);
		aluno.setNota2(30);
		aluno.setNotaFinal(69);
		assertFalse(aluno.calcularResultadoAluno());
	}
}
