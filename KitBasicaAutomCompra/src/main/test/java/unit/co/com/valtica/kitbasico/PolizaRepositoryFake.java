package java.unit.co.com.valtica.kitbasico;

import org.junit.Test;
import org.springframework.context.annotation.Profile;

import co.com.valtica.kitbasico.datos.PolizaRepository;
import co.com.valtica.kitbasico.entidades.Poliza;

@Profile("test")
public class PolizaRepositoryFake implements PolizaRepository {

	@Test
	public Poliza consultarPoliza(String idPoliza) {

		if (idPoliza.equals("123")) {
			return new Poliza(true, 100000f);
		} else {
			return new Poliza(false, 0f);
		}
	}

}
