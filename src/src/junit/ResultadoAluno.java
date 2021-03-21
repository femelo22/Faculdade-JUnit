package src.junit;

public class ResultadoAluno {
	
	public Integer frequencia;
	public double nota1;
	public double nota2;
	public double notaFinal;
	
	public Integer getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(Integer frequencia) {
		this.frequencia = frequencia;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}



	public boolean calcularResultadoAluno() {
		double media;
		
		if(frequencia < 75) {
			return false;
		} else {
			media = (nota1 + nota2) / 2;
			if(media < 30) {
				return false;
			}else {
				if(media >= 70) {
					return true;
				}else {
					if(((media + notaFinal) / 2) >= 50) {
						return true;
					}else {
						return false;
					}
				}
			}
		}
	}
}
