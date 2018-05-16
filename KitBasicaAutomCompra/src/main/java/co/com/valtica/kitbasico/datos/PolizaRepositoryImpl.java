package co.com.valtica.kitbasico.datos;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.com.valtica.kitbasico.entidades.Poliza;

@Component
public class PolizaRepositoryImpl implements PolizaRepository {

	public Poliza consultarPoliza(String idPoliza) {

		RestTemplate restTemplate = new RestTemplate();
		Poliza poliza = restTemplate.getForObject("http://172.16.0.123:6969/api/poliza/"+idPoliza, Poliza.class);
		return poliza;
	}

}
