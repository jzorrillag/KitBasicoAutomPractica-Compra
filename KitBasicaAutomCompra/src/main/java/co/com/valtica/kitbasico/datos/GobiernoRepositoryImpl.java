package co.com.valtica.kitbasico.datos;

import org.springframework.stereotype.Component;

@Component
public class GobiernoRepositoryImpl implements GobiernoRepository {

	@Override
	public float consultarImpuestoRiqueza() {
		return 0.10f;
	}

	@Override
	public float consultarSalarioMinimo() {
		return 850f;
	}

}
