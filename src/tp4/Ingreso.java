package tp4;

public class Ingreso {
	String mesDePercepcion;
	String concepto;
	Float montoPercibido;
	
	public Ingreso(String mesDePercepcion, String concepto, Float monto){
		this.setMesDePercepcion(mesDePercepcion);
		this.setConcepto(concepto);
		this.setMontoPercibido(monto);
	}

	public String getMesDePercepcion() {
		return mesDePercepcion;
	}

	private void setMesDePercepcion(String mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	private void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Float getMontoPercibido() {
		return montoPercibido;
	}

	private void setMontoPercibido(Float montoPercibido) {
		this.montoPercibido = montoPercibido;
	}
	
	public Float montoImponible() {
		return this.getMontoPercibido();
	}
}
