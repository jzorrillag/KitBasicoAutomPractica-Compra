package co.com.valtica.kitbasico.entidades;

public class Poliza {

	private boolean financiado;
	private float valorPoliza;

	public Poliza(boolean financiado, float valorPoliza) {
		super();
		this.financiado = financiado;
		this.valorPoliza = valorPoliza;
	}

	public Poliza() {
		super();
	}

	public boolean isFinanciado() {
		return financiado;
	}

	public void setFinanciado(boolean financiado) {
		this.financiado = financiado;
	}

	public float getValorPoliza() {
		return valorPoliza;
	}

	public void setValorPoliza(float valorPoliza) {
		this.valorPoliza = valorPoliza;
	}

}
