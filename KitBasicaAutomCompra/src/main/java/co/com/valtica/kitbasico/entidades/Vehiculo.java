package co.com.valtica.kitbasico.entidades;

public class Vehiculo {

	private Boolean asegurable;
	private String mensaje;

	public Vehiculo() {
		super();
	}

	public Vehiculo(Boolean asegurable, String mensaje) {
		super();
		this.asegurable = asegurable;
		this.mensaje = mensaje;
	}

	public Boolean getAsegurable() {
		return asegurable;
	}

	public void setAsegurable(Boolean asegurable) {
		this.asegurable = asegurable;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
