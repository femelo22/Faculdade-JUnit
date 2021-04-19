package src.junit.exercicio;

public class CalculadoraDeSono {

	private Integer idade;
	private Integer horasDormidas;
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Integer getHorasDormidas() {
		return horasDormidas;
	}
	public void setHorasDormidas(Integer horasDormidas) {
		this.horasDormidas = horasDormidas;
	}
	
	public String calcularSono() {
		
		if(idade > 0 && idade < 5) {
			if(horasDormidas >= 10 && horasDormidas <= 14) {
				return "Sono ideal para crianças de 1 a 5 anos";
			}else {
				return "Sono desregulado para crianças de 1 a 5 anos";
			}
		}else if(idade < 13) {
			if(horasDormidas >= 9 && horasDormidas <= 11) {
				return "Sono ideal para crianças de 6 aos 13 anos";
			}else {
				return "Sono desregulado para crianças de 6 aos 13 anos";
			}
		}else if(idade < 17) {
			if(horasDormidas >= 8 && horasDormidas <= 9) {
				return "Sono ideal para adolescentes de 14 a 17 anos";
			}else {
				return "Sono desregulado para adolescentes de 14 a 17 anos";
			}
		}else if(idade < 64) {
			if(horasDormidas >= 7 && horasDormidas <= 9) {
				return "Sono ideal para adultos de 18 a 64 anos";
			}else {
				return "Sono desregulado para adultos de 18 a 64 anos";
			}
		}else {
			return "Idade inválida";
		}
		
	}
	
}
