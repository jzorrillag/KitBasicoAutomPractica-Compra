package co.com.valtica.kitbasico.datos;

import co.com.valtica.kitbasico.entidades.Poliza;

public interface PolizaRepository {
	
	Poliza consultarPoliza(String idPoliza);

}
