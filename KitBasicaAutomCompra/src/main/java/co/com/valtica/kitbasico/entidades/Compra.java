package co.com.valtica.kitbasico.entidades;

public class Compra {

	private String idAsegurado;
	private String idPoliza;
	private String placa;
	private String numeroDocumento;
	private float iva;
	private float impuestoRiqueza;
	private float retencion;
	private float valorPoliza;

	public float getValorPoliza() {
		return valorPoliza;
	}

	public void setValorPoliza(float valorPoliza) {
		this.valorPoliza = valorPoliza;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public float getImpuestoRiqueza() {
		return impuestoRiqueza;
	}

	public void setImpuestoRiqueza(float impuestoRiqueza) {
		this.impuestoRiqueza = impuestoRiqueza;
	}

	public float getRetencion() {
		return retencion;
	}

	public void setRetencion(float retencion) {
		this.retencion = retencion;
	}

	public String getIdPoliza() {
		return idPoliza;
	}

	public void setIdPoliza(String idPoliza) {
		this.idPoliza = idPoliza;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getIdAsegurado() {
		return idAsegurado;
	}

	public void setIdAsegurado(String idAsegurado) {
		this.idAsegurado = idAsegurado;
	}

}
