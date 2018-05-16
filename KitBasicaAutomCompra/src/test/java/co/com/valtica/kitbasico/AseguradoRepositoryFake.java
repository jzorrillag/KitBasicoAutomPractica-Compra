package co.com.valtica.kitbasico;

import org.springframework.context.annotation.Profile;

import co.com.valtica.kitbasico.datos.AseguradoRepository;

@Profile("test")
public class AseguradoRepositoryFake implements AseguradoRepository {

	@Override
	public String obtenerTipoAsegurado(String idAsegurado) {
		if ("1".equals(idAsegurado)) {
			return "I";
		} else {
			return "D";
		}

	}

}
