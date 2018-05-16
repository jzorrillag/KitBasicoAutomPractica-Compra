package co.com.valtica.kitbasico.datos;

import co.com.valtica.kitbasico.entidades.Vehiculo;

public interface VehiculoRepository {
	
	Vehiculo validarVehiculo(String idPlaca);

}
