package co.com.valtica.kitbasico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.valtica.kitbasico.datos.GobiernoRepository;
import co.com.valtica.kitbasico.datos.PolizaRepository;
import co.com.valtica.kitbasico.entidades.Compra;
import co.com.valtica.kitbasico.entidades.Poliza;

@Service
public class CompraServiceImpl implements CompraService {

	@Autowired
	PolizaRepository polizaRepository;

//	@Autowired
//	GobiernoRepository gobiernoRepository;

	private static final float PORCENTAJE_IVA = 0.19f;

	@Override
	public Compra calcularValorPoliza(String idPoliza, String idAsegurado) {
		Poliza poliza = polizaRepository.consultarPoliza(idPoliza);

		Compra compra = new Compra();

		compra.setIva(calcularIVA(poliza.getValorPoliza()));
		// compra.setImpuestoRiqueza(calcularImpuestoRiqueza(poliza.getValorPoliza()));
		// compra.setRetencion(calcularRetencion(idAsegurado,
		// poliza.getValorPoliza()));
		return compra;
	}

	private Float calcularIVA(float valorPoliza) {
		// Poliza poliza = polizaRepository.consultarPoliza(idPoliza);
		return valorPoliza * PORCENTAJE_IVA;
	}

	private Float calcularImpuestoRiqueza(float montoPoliza) {

		float porcentajeImpuesto = 0.19f; //gobiernoRepository.consultarImpuestoRiqueza();

		return porcentajeImpuesto * montoPoliza;
	}

	private Float calcularRetencion(String idAsegurado, float montoPoliza) {

		return null;
	}

}
