package src.junit;



import junit.framework.TestCase;
import src.junit.Imc;

public class ImcTest extends TestCase {

	Imc imc;
	
	//@Before
	protected void setUp(){
		imc = new Imc();
	}
	
	//@Test
	public void testCalcularImc_SexoInvalido() {
		imc.setSexo("teste");
		assertEquals("Sexo invalido", imc.calcularIMC());
	}
	
	//@Test
	public void testCalcularImcMulher_SexoDiferenteDeMulher() {
		imc.setSexo("Homem");
		assertEquals("Dados invalidos", imc.calcularIMC());
	}
	
	//@Test
	public void testCestCalcularImcMulher_PesoAbaixo() {
		imc.setSexo("Mulher");
		imc.setPeso(53);
		imc.setAltura(1.70);
		assertEquals("Abaixo do peso", imc.calcularIMC());
	}
	
	//@Test
	public void testCalcularImcMulher_PesoNormalPrimeiraCondicao() {
		imc.setSexo("Mulher");
		imc.setPeso(55.4);
		imc.setAltura(1.70);
		assertEquals("Peso normal", imc.calcularIMC());
	}
	
	//@Test
	public void testCalcularImcMulher_PesoNormalSegundaCondicao() {
		imc.setSexo("Mulher");
		imc.setPeso(72);
		imc.setAltura(1.70);
		assertEquals("Peso normal", imc.calcularIMC());
	}
	
	//@Test
	public void testCalcularImcMulher_PesoMarginalmenteAcimaPrimeiraCondicao() {
		imc.setSexo("Mulher");
		imc.setPeso(74.6);
		imc.setAltura(1.70);
		assertEquals("Marginalmente acima do peso", imc.calcularIMC());
	}
	
	//@Test
	public void testCalcularImcMulher_PesoMarginalmenteAcimaSegundaCondicao() {
		imc.setSexo("Mulher");
		imc.setPeso(76.6);
		imc.setAltura(1.70);
		assertEquals("Marginalmente acima do peso", imc.calcularIMC());
	}
	
	//@Test
	public void testCalcularImcMulher_PesoAcimaPrimeiraCondicao() {
		imc.setSexo("Mulher");
		imc.setPeso(79);
		imc.setAltura(1.70);
		assertEquals("Acima do peso", imc.calcularIMC());
	}
	
	//@Test
	public void testCalcularImcMulher_PesoAcimaSegundaCondicao() {
		imc.setSexo("Mulher");
		imc.setPeso(90.4);
		imc.setAltura(1.70);
		assertEquals("Acima do peso", imc.calcularIMC());
	}
	
	//@Test
	public void testCalcularImcMulher_Obesa() {
		imc.setSexo("Mulher");
		imc.setPeso(93.7);
		imc.setAltura(1.70);
		assertEquals("Obesa", imc.calcularIMC());
	}
	
	//@Test
	public void testCalcularImcHomem_SexoDiferenteDeHomem() {
		imc.setSexo("Mulher");
		assertEquals("Dados invalidos", imc.calcularIMC());
	}
	
	//@Test
	public void testCalcularImcHomem_PesoAbaixo() {
		imc.setSexo("Homem");
		imc.setPeso(57.7);
		imc.setAltura(1.70);
		assertEquals("Abaixo do peso", imc.calcularIMC());
	}
	
	//@Test
	public void testCalcularImcHomem_PesoNormalPrimeiraCondicao() {
		imc.setSexo("Homem");
		imc.setPeso(60);
		imc.setAltura(1.70);
		assertEquals("Peso normal", imc.calcularIMC());
	}
	
	//@Test
	public void testCalcularImcHomem_PesoNormalSegundaCondicao() {
		imc.setSexo("Homem");
		imc.setPeso(73.8);
		imc.setAltura(1.70);
		assertEquals("Peso normal", imc.calcularIMC());
	}
	
	//@Test
	public void testCalcularImcHomem_PesoMargialmenteAcimaPrimeiraCondicao() {
		imc.setSexo("Homem");
		imc.setPeso(76.4);
		imc.setAltura(1.70);
		assertEquals("Marginalmente acima do peso", imc.calcularIMC());
	}
	//@Test
	public void testCalcularImcHomem_PesoMargialmenteAcimaSegundaCondicao() {
		imc.setSexo("Homem");
		imc.setPeso(77.8);
		imc.setAltura(1.70);
		assertEquals("Marginalmente acima do peso", imc.calcularIMC());
	}
	//@Test
	public void testCalcularImcHomem_PesoAcimaPrimeiraCondicao() {
		imc.setSexo("Homem");
		imc.setPeso(80.4);
		imc.setAltura(1.70);
		assertEquals("Acima do peso", imc.calcularIMC());
	}
	//@Test
	public void testCalcularImcHomem_PesoAcimaSegundaCondicao() {
		imc.setSexo("Homem");
		imc.setPeso(87);
		imc.setAltura(1.70);
		assertEquals("Acima do peso", imc.calcularIMC());
	}
	//@Test
	public void testCalcularImcHomem_Obeso() {
		imc.setSexo("Homem");
		imc.setPeso(90);
		imc.setAltura(1.70);
		assertEquals("Obeso", imc.calcularIMC());
	}
	
}
