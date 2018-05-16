package co.com.valtica.kitbasico;

import org.springframework.context.annotation.Profile;

import co.com.valtica.kitbasico.datos.VehiculoRepository;
import co.com.valtica.kitbasico.entidades.Vehiculo;

@Profile("test")
public class VehiculoRepositoryFake implements VehiculoRepository {

	@Override
	public Vehiculo validarVehiculo(String idPlaca) {

		if ("1".equals(idPlaca)) {
			return new Vehiculo(true, "Asegurable");

		} else {
			return new Vehiculo(false, "No se encuentra autorizado");
		}

	}

}
