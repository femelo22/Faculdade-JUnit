package src.junit;

public class Exame {

	private Integer medida;

	public Integer getMedida() {
		return medida;
	}

	public void setMedida(Integer medida) {
		this.medida = medida;
	}

	public String medidaTriglicerides() {
		if (medida < 150) {
			return "Desejavel";
		} else if (medida < 199) {
			return "Limitrofe";
		} else if (medida < 499) {
			return "Alto";
		} else {
			return "Muito alto";
		}
	}

	public String medidaColesterolTotal() {
		if (medida < 200) {
			return "Desejavel";
		} else if (medida < 239) {
			return "Limitrofe";
		} else {
			return "Elevado";
		}
	}

	public String medidaColesterolHDL() {
		if (medida < 40) {
			return "Baixo";
		} else if (medida < 60) {
			return "Normal";
		} else {
			return "Desejavel";
		}
	}

	public String medidaColesterolLDL() {
		if (medida < 100) {
			return "Muito bom";
		} else if (medida < 129) {
			return "Desejavel";
		} else if (medida < 159) {
			return "Limitrofe";
		} else if (medida < 189) {
			return "Alto";
		} else {
			return "Muito alto";
		}
	}

	public String medidaColesterolVLDL() {
		if (medida < 30) {
			return "Desejavel";
		} else if (medida < 40) {
			return "Limitrofe";
		} else {
			return "Elevado";
		}
	}

	public String medidaGlicose() {
		if (medida < 60) {
			return "Hipoglicemia";
		} else if (medida < 99) {
			return "Desejavel";
		} else if (medida < 125) {
			return "Glicemia de jejum inapropriada";
		} else {
			return "Diabetes";
		}
	}

}
