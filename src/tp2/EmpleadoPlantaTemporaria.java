package tp2;

public class EmpleadoPlantaTemporaria extends Empleado {
	String fechaFinDeDesingacionATemporaria;
	int cantidadDeHorasExtra;
	
	public EmpleadoPlantaTemporaria(String nombre, String direccion, String estadoCivil, String fechaNacimiento, 
			Float sueldoBasico, int cantHorasExtra, String fechaFinDeDesingacionATemporaria) {
		
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setEstadoCivil(estadoCivil);
		this.setFechaDeNacimiento(fechaNacimiento);
		this.setSueldoBasico(sueldoBasico);
		this.setCantidadDeHorasExtra(cantHorasExtra);
		this.setfechaFinDeDesingacionATemporaria(fechaFinDeDesingacionATemporaria);
	}
	
	public void setfechaFinDeDesingacionATemporaria(String fecha){
		this.fechaFinDeDesingacionATemporaria = fecha;
	}
	
	public void setCantidadDeHorasExtra(Integer cantHoras) {
		this.cantidadDeHorasExtra = cantHoras;
	}
	
	public Float sueldoBruto() {
		return this.sueldoBasico + this.pagoHorasExtra();
	}
	
	public Integer pagoHorasExtra() {
		return this.cantidadDeHorasExtra * 40;
	}
	
	public Float retenciones(){
		return retencionesObraSocial() + aportesJubilatorios();
	}
	
	public Float retencionesObraSocial() {
		return (this.sueldoBruto() * 10) / 100;
	}
	
	public Float aportesJubilatorios() {
		if (this.calcularEdad() > 50){
			return this.porcentajeDelSueldo(this.sueldoBruto(), (float) 10) + this.cantidadDeHorasExtra * 5;
		} else {
			return this.porcentajeDelSueldo(this.sueldoBruto(), (float) 10) + 25;
		}
	}
	
	public void desgloce() {
		System.out.println("sueldo Basico"  + this.getSueldoBasico().toString());
		System.out.println("pago horas extra"  + this.pagoHorasExtra().toString());
		System.out.println("retenciones obra social"  + this.retencionesObraSocial().toString());
		System.out.println("jubilacion"  + this.aportesJubilatorios().toString());
		System.out.println("sueldo bruto"  + this.sueldoBruto().toString());
		System.out.println("sueldo neto"  + this.sueldoNeto().toString());
	}
	
}
