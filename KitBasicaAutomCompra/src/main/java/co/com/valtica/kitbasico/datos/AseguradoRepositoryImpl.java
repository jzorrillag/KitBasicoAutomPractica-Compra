package co.com.valtica.kitbasico.datos;

import org.springframework.stereotype.Component;

@Component
public class AseguradoRepositoryImpl implements AseguradoRepository {

	@Override
	public String obtenerTipoAsegurado(String idAsegurado) {

		return "I";
	}

}
