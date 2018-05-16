package co.com.valtica.kitbasico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.valtica.kitbasico.datos.GobiernoRepository;
import co.com.valtica.kitbasico.datos.PolizaRepository;
import co.com.valtica.kitbasico.entidades.Poliza;

@Service
public class CompraServiceImpl implements CompraService{
	
	@Autowired
	PolizaRepository polizaRepository;
	
	@Autowired
	GobiernoRepository gobiernoRepository;
	
	private static final float PORCENTAJE_IVA = 0.19f;


//	public Float calcularImpuesto(String idPoliza) {
//		Poliza poliza = polizaRepository.consultarPoliza(idPoliza);
//		
//		float valorIva =calcularIVA(poliza.getValorPoliza());
//		float valorRiqueza =calcularImpuestoRiqueza(poliza.getValorPoliza());
//		
//		return poliza.getValorPoliza()*PORCENTAJE_IVA;
//	}

	
	@Override
	public Float calcularIVA(String idPoliza) {
		Poliza poliza = polizaRepository.consultarPoliza(idPoliza);
		return poliza.getValorPoliza()*PORCENTAJE_IVA;
	}
	
	@Override
	public Float calcularImpuestoRiqueza(float montoPoliza) {
		
		float porcentajeImpuesto = gobiernoRepository.consultarImpuestoRiqueza();
		return porcentajeImpuesto*montoPoliza;
	}


	@Override
	public Float calcularRetencion(String idAsegurado, float montoPoliza) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	

}
