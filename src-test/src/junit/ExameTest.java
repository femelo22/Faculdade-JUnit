package src.junit;

import junit.framework.TestCase;

public class ExameTest extends TestCase {
	
	private Exame exame ;
	
	private String DESEJAVEL = "Desejavel";
	private String LIMITROFE = "Limitrofe";
	private String ALTO = "Alto";
	private String BAIXO = "Baixo";
	private String MUITO_ALTO = "Muito alto";
	private String MUITO_BOM = "Muito bom";
	private String ELEVADO = "Elevado";
	private String NORMAL = "Normal";
	private String HIPOGLICEMIA = "Hipoglicemia";
	private String GLICEMIA = "Glicemia de jejum inapropriada";
	private String DIABETES = "Diabetes";
	
	public void setUp() {
		exame = new Exame();
	}
	
	public void testResultadoTriglicerides_Desejavel() {
		exame.setMedida(149);
		assertEquals(DESEJAVEL, exame.medidaTriglicerides());
	}
	
	public void testResultadoTriglicerides_Limitrofe() {
		exame.setMedida(199);
		assertEquals(LIMITROFE, exame.medidaTriglicerides());
	}
	
	public void testResultadoTriglicerides_Alto() {
		exame.setMedida(498);
		assertEquals(ALTO, exame.medidaTriglicerides());
	}
	
	public void testResultadoTriglicerides_MuitoAlto() {
		exame.setMedida(499);
		assertEquals(MUITO_ALTO, exame.medidaTriglicerides());
	}
	
	
	// ---------------
	
	
	public void testResultadoColesterolTotal_Desejavel() {
		exame.setMedida(199);
		assertEquals(DESEJAVEL, exame.medidaColesterolTotal());
	}
	
	public void testResultadoColesterolTotal_Limitrofe() {
		exame.setMedida(238);
		assertEquals(LIMITROFE, exame.medidaColesterolTotal());
	}
	
	public void testResultadoColesterolTotal_Elevado() {
		exame.setMedida(239);
		assertEquals(ELEVADO, exame.medidaColesterolTotal());
	}
	
	
	// ---------------
	
	
	public void testColesterolHDL_Baixo() {
		exame.setMedida(39);
		assertEquals(BAIXO, exame.medidaColesterolHDL());
	}
	
	public void testColesterolHDL_Normal() {
		exame.setMedida(59);
		assertEquals(NORMAL, exame.medidaColesterolHDL());
	}
	
	public void testColesterolHDL_Desejavel() {
		exame.setMedida(60);
		assertEquals(DESEJAVEL, exame.medidaColesterolHDL());
	}
	
	
	
	// ---------------
	
	
	
	public void testColesterolLDL_MuitoBom() {
		exame.setMedida(99);
		assertEquals(MUITO_BOM, exame.medidaColesterolLDL());
	}
	
	public void testColesterolLDL_Desejavel() {
		exame.setMedida(128);
		assertEquals(DESEJAVEL, exame.medidaColesterolLDL());
	}
	
	public void testColesterolLDL_Limitrofe() {
		exame.setMedida(158);
		assertEquals(LIMITROFE, exame.medidaColesterolLDL());
	}
	
	public void testColesterolLDL_Alto() {
		exame.setMedida(188);
		assertEquals(ALTO, exame.medidaColesterolLDL());
	}
	
	public void testColesterolLDL_MuitoAlto() {
		exame.setMedida(189);
		assertEquals(MUITO_ALTO, exame.medidaColesterolLDL());
	}
	
	
	
	// ---------------
	
	
	
	public void testColesterolVLDL_Desejavel(){
		exame.setMedida(29);
		assertEquals(DESEJAVEL, exame.medidaColesterolVLDL());
	}
	
	public void testColesterolVLDL_Limitrofe(){
		exame.setMedida(39);
		assertEquals(LIMITROFE, exame.medidaColesterolVLDL());
	}
	
	public void testColesterolVLDL_Elevado(){
		exame.setMedida(40);
		assertEquals(ELEVADO, exame.medidaColesterolVLDL());
	}
	
	
	
	// ---------------
	
	
	public void testGlicose_Hipoglicemia() {
		exame.setMedida(59);
		assertEquals(HIPOGLICEMIA, exame.medidaGlicose());
	}
	
	public void testGlicose_Desejavel() {
		exame.setMedida(98);
		assertEquals(DESEJAVEL, exame.medidaGlicose());
	}
	
	public void testGlicose_Glicemia() {
		exame.setMedida(124);
		assertEquals(GLICEMIA, exame.medidaGlicose());
	}
	
	public void testGlicose_Diabetes() {
		exame.setMedida(125);
		assertEquals(DIABETES, exame.medidaGlicose());
	}
	

}
