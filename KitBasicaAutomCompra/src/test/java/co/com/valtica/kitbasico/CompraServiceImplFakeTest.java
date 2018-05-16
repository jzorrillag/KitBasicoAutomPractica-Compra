package co.com.valtica.kitbasico;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.com.valtica.kitbasico.GobiernoRepositoryFake;
import co.com.valtica.kitbasico.PolizaRepositoryFake;
import co.com.valtica.kitbasico.entidades.Compra;
import co.com.valtica.kitbasico.service.CompraService;
import co.com.valtica.kitbasico.service.CompraServiceImpl;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { PolizaRepositoryFake.class, GobiernoRepositoryFake.class, CompraServiceImpl.class })
public class CompraServiceImplFakeTest {

	@Autowired
	CompraService compraService;

	@Test
	public void calcularIVAIdPolizacorrecto() {
		Compra compra = compraService.calcularValorPoliza("123", "123");
		Assert.assertEquals(19000f, compra.getIva(), 0);
	}
	
	@Test
	public void calcularIVAIdPolizaNoEncontrado() {
		Compra compra = compraService.calcularValorPoliza("1111", "123");
		Assert.assertEquals(0, compra.getIva(), 0);

	}
	
	@Test
	public void calcularImpuestoRiquezaCorrecto() {
		Compra compra = compraService.calcularValorPoliza("123", "123");
		Assert.assertEquals(10000f, compra.getImpuestoRiqueza(), 0);
	}
	
	@Test
	public void calcularImpuestoRiquezaInCorrecto() {
		Compra compra = compraService.calcularValorPoliza("1111", "123");
		Assert.assertEquals(0f, compra.getImpuestoRiqueza(), 0);
	}
	
	@Test
	public void calcularRetencionEmpleado() {


	}
	
	@Test
	public void calcularRetencionIndependiente() {


	}
	
	
}
