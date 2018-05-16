package co.com.valtica.kitbasico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.valtica.kitbasico.datos.AseguradoRepository;
import co.com.valtica.kitbasico.datos.GobiernoRepository;
import co.com.valtica.kitbasico.datos.PolizaRepository;
import co.com.valtica.kitbasico.entidades.Compra;
import co.com.valtica.kitbasico.entidades.Poliza;

@Service
public class CompraServiceImpl implements CompraService {

	@Autowired
	PolizaRepository polizaRepository;

	@Autowired
	GobiernoRepository gobiernoRepository;

	@Autowired
	AseguradoRepository aseguradoRepository;

	@Autowired

	private static final float PORCENTAJE_IVA = 0.19f;

	@Override
	public Compra calcularValorPoliza(String idPoliza, String idAsegurado) {

		Poliza poliza = polizaRepository.validarPoliza(idPoliza);

		Compra compra = new Compra();

		compra.setIva(calcularIVA(poliza.getValorPoliza()));
		compra.setImpuestoRiqueza(calcularImpuestoRiqueza(poliza.getValorPoliza()));
		compra.setRetencion(calcularRetencion(idAsegurado, poliza.getValorPoliza()));

		float valorTotal = poliza.getValorPoliza() + compra.getIva() + compra.getImpuestoRiqueza()
				+ compra.getRetencion();

		compra.setValorPoliza(valorTotal);

		return compra;
	}

	private Float calcularIVA(float valorPoliza) {
		return valorPoliza * PORCENTAJE_IVA;
	}

	private Float calcularImpuestoRiqueza(float montoPoliza) {

		float porcentajeImpuesto = gobiernoRepository.consultarImpuestoRiqueza();
		return porcentajeImpuesto * montoPoliza;
	}

	private Float calcularRetencion(String idAsegurado, float montoPoliza) {

		String tipoAsegurado = aseguradoRepository.obtenerTipoAsegurado(idAsegurado);

		return "I".equals(tipoAsegurado) ? montoPoliza * 0.11f : montoPoliza * 0.04f;
	}

}
