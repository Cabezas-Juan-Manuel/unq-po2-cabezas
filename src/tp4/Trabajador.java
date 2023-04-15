package tp4;

import java.util.ArrayList;

public class Trabajador {
	Float totalPercibido;
	Float montoImponible;
	Float impuestoAPagar;
	ArrayList <Ingreso> ingresos = new ArrayList <Ingreso> ();
	
	private void setTotalPercibido() {
		Float montoTotal = (float) 0;
		for(int i = 0; i < this.ingresos.size(); i++) {
			montoTotal += this.ingresos.get(i).getMontoPercibido();
		}
		totalPercibido = montoTotal;
	}
	
	public Float getTotalPercibido() {
		return this.totalPercibido;
	}
	
	private void setTotalImponible() {
		Float montoTotal = (float) 0;
		for(int i = 0; i < this.ingresos.size(); i++) {
			montoTotal += this.ingresos.get(i).montoImponible();
		}
		this.montoImponible = montoTotal;
	}
	
	public Float getMontoImponible() {
		return this.montoImponible;
	}
	
	private void setImpuestoAPagar(){
		this.impuestoAPagar = (float) (this.getMontoImponible() * 0.2);
	}
	
	public Float getImpuestoAPagar() {
		return this.impuestoAPagar;
	}
}
