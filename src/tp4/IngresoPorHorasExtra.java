package tp4;

public class IngresoPorHorasExtra extends Ingreso{
	private Integer cantidadHorasExtra;
	public IngresoPorHorasExtra(String mesDePercepcion, String concepto, Float monto, Integer cantidadHorasExtra) {
		super(mesDePercepcion, concepto, monto);
		this.setCantidadHorasExtra(cantidadHorasExtra);
	}
	
	private void setCantidadHorasExtra( Integer cantHorasExtra) {
		this.cantidadHorasExtra = cantHorasExtra;
	}
	
	public Float montoImponible() {
		return (float) 0;
	}
	
	public Integer getCantidadHorasExtra() {
		return this.cantidadHorasExtra;
	}
}
