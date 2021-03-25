package src.junit;

public class Imc {

	private String sexo;
	private double peso;
	private double altura;
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}


	public String calcularIMC() {
		
		double imc = peso / (altura * altura);
		
		if(sexo.equals("Mulher")) {
			if (imc < 19.1) {
				return "Abaixo do peso";
			} else if (imc < 25.8) {
				return "Peso normal";
			} else if (imc < 27.3) {
				return "Marginalmente acima do peso";
			} else if (imc < 32.3) {
				return "Acima do peso";
			} else {
				return "Obesa";
			} 
		}else{
			if (imc < 20.7) {
				return "Abaixo do peso";
			} else if (imc < 26.4) {
				return "Peso normal";
			} else if (imc < 27.8) {
				return "Marginalmente acima do peso";
			} else if (imc < 31.1) {
				return "Acima do peso";
			} else{
				return "Obeso";
			} 
		}
		
	}
		
}
