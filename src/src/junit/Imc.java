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
		
		if(sexo.equals("Mulher")) {//1
			double imcMulher = peso / (altura * altura);			
			
			if (imcMulher < 19.1) {//2
				return "Abaixo do peso";
			} else if (imcMulher >= 19.1 && imcMulher < 25.8) {
				return "Peso normal";
			} else if (imcMulher >= 25.8 && imcMulher < 27.3) {
				return "Marginalmente acima do peso";
			} else if (imcMulher >= 27.3 && imcMulher < 32.3) {
				return "Acima do peso";
			} else if (imcMulher >= 32.3) {
				return "Obesa";
			} else {
				return "Dados invalidos";
			}
		}else if(sexo.equalsIgnoreCase("Homem")){
			double imcHomem = peso / (altura * altura);

			if (imcHomem < 20.7) {
				return "Abaixo do peso";
			} else if (imcHomem >= 20.7 && imcHomem < 26.4) {
				return "Peso normal";
			} else if (imcHomem >= 26.4 && imcHomem < 27.8) {
				return "Marginalmente acima do peso";
			} else if (imcHomem >= 27.8 && imcHomem < 31.1) {
				return "Acima do peso";
			} else if (imcHomem >= 31.1) {
				return "Obeso";
			} else {
				return "Dados invalidos";
			}
		}else {
			return "Sexo invalido";
		}
		
	}
		
}
