package co.com.valtica.kitbasico.datos;

import org.springframework.stereotype.Component;

@Component
public class AseguradoRepositoryImpl implements AseguradoRepository {

	@Override
	public String obtenerTipoAsegurado(String idAsegurado) {

//		RestTemplate restTemplate = new RestTemplate();
//		String tipoAsegurado = restTemplate.getForObject("http://172.16.0.123:6666/api/asegurado/" + idAsegurado,
//				String.class);
		return "I";
	}

}
