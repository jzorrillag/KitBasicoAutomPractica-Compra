package java.unit.co.com.valtica.kitbasico;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.com.valtica.kitbasico.service.CompraService;
import co.com.valtica.kitbasico.service.CompraServiceImpl;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { PolizaRepositoryFake.class, CompraServiceImpl.class })
public class CompraServiceImplFakeTest {

	@Autowired
	CompraService compraService;

	@Test
	public void calcularIVAIdPolizacorrecto() {
		float valorIva = compraService.calcularIVA("123");
		Assert.assertEquals(19000f, valorIva, 0);
	}
	
	@Test
	public void calcularIVAIdPolizaNoEncontrado() {
		float valorIva = compraService.calcularIVA("111");
		Assert.assertEquals(0, valorIva, 0);

	}
}
