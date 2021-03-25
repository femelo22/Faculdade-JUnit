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
		if(medida < 150) {
			return "Nivel desejável";
		}else if(medida < 199) {
			return "Nivel limitrofe";
		}else if(medida < 499) {
			return "Nivel alto";
		}else {
			return "Nível muito alto";
		}	
	}
	
	
	public String medidaColesterolTotal() {
		if(medida < 200) {
			return "Nivel desejável";
		}else if(medida < 239) {
			return "Nivel limitrofe";
		}else {
			return "Nivel Elevado";
		}
	}
	
	
	public String medidaColesterolHDL() {
		if(medida < 40) {
			return "Nivel baixo";
		}else if(medida < 60) {
			return "Nivel normal";
		}else {
			return "Nivel desejável";
		}
	}
	
	
	public String medidaColesterolLDL() {
		if(medida < 100) {
			return "Nivel muito bom";
		}else if(medida < 129) {
			return "Nivel desejável";
		}else if(medida < 159) {
			return "Nivel limitrofe";
		}else if(medida < 189) {
			return "Nivel alto";
		}else {
			return "Nível muito alto";
		}
	}
	
	
	public String medidaColesterolVLDL() {
		if(medida < 30) {
			return "Nivel desejável";
		}else if(medida < 40) {
			return "Nivel limitrofe";
		}else {
			return "Nivel elevado";
		}
	}
	
	
	public String medidaGlicose() {
		if(medida < 60) {
			return "Hipoglicemia";
		}else if(medida < 99) {
			return "Nivel desejável";
		}else if(medida < 125) {
			return "Glicemia de jejum inapropriada";
		}else {
			return "Diabetes";
		}
	}


}
