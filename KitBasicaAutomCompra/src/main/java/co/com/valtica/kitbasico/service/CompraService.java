package co.com.valtica.kitbasico.service;

public interface CompraService {

	Float calcularIVA(String idPoliza);
	Float calcularImpuestoRiqueza(float montoPoliza);
	//Float calcularImpuesto(String idPoliza);
	Float calcularRetencion(String idAsegurado, float montoPoliza );


}
