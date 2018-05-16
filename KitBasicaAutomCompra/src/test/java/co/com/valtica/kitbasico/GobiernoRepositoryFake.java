package co.com.valtica.kitbasico;

import org.springframework.context.annotation.Profile;

import co.com.valtica.kitbasico.datos.GobiernoRepository;

@Profile("test")
public class GobiernoRepositoryFake implements GobiernoRepository {
	
	public float consultarImpuestoRiqueza() {
		return 0.10f;
	}

	public float consultarSalarioMinimo() {
		return 850f;
	}

}
