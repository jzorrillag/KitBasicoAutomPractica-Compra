package co.com.valtica.kitbasico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.valtica.kitbasico.datos.PolizaRepository;
import co.com.valtica.kitbasico.entidades.Poliza;

@Service
public class CompraServiceImpl implements CompraService{
	
	@Autowired
	PolizaRepository polizaRepository;
	
	private static final float PORCENTAJE_IVA = 0.19f;

	@Override
	public Float calcularIVA(String idPoliza) {
		Poliza poliza = polizaRepository.consultarPoliza(idPoliza);	
		return poliza.getValorPoliza()*PORCENTAJE_IVA;
	}

}
