package co.com.valtica.kitbasico.datos;

import org.springframework.web.client.RestTemplate;

import co.com.valtica.kitbasico.entidades.Vehiculo;

public class VehiculoRepositoryImpls implements VehiculoRepository {

	@Override
	public Vehiculo validarVehiculo(String idPlaca) {

		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://172.16.0.123:8585/api/vehiculo/valida/" + idPlaca, Vehiculo.class);

	}

}
