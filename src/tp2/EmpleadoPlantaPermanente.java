package tp2;

public class EmpleadoPlantaPermanente extends Empleado {
	
	Float cantidadDeHijos;
	Float antiguedad;
	
	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, String fechaDeNacimiento,
			Float sueldoBasico, Float cantidadDeHijos, Float antiguedad) {
		
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setEstadoCivil(estadoCivil);
		this.setFechaDeNacimiento(fechaDeNacimiento);
		this.setSueldoBasico(sueldoBasico);
		this.setCantidadDeHijos(cantidadDeHijos);
		this.setAntiguedad(antiguedad);
	}
	
	
	public void setCantidadDeHijos(Float numeroDeHijos) {
		this.cantidadDeHijos = numeroDeHijos;
	}
	
	public void setAntiguedad(Float anios) {
		this.antiguedad = anios;
	}
	
	public Float asignacionPorHijo(){
		return 150 * this.cantidadDeHijos;
	}
	
	
	public  Float asignacionPorConyuge(){
		if (this.estadoCivil == "Casado"); {
			return (float) 100;
		}
	}
	
	public Float salarioFamiliar() {
		return (this.asignacionPorConyuge() + this.asignacionPorHijo());
	}
	
	public Float antiguedad(){
		return (this.antiguedad * 50);
	}
	
	public Float retencionesObraSocial() {
		return this.porcentajeDelSueldo(this.sueldoBruto(), (float) 10) + this.cantidadDeHijos * 20;
	}
	
	public Float aportesJubilatorios() {
		return  this.porcentajeDelSueldo(this.sueldoBruto(), (float) 15);
	}
	
	public Float retenciones() {
		return this.retencionesObraSocial() + this.aportesJubilatorios();
	}
	
	public Float sueldoBruto() {
		return this.sueldoBasico + this.salarioFamiliar() + this.antiguedad();
	}
	
	public Float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	public void desgloce() {
		System.out.println("sueldo Basico"  + this.getSueldoBasico().toString());
		System.out.println("asignacion por hijo"  + this.asignacionPorHijo().toString());
		System.out.println("asignacion por conyugue" + this.asignacionPorConyuge().toString());
		System.out.println("antiguedad"  + this.antiguedad().toString());
		System.out.println("retenciones obra social"  + this.retencionesObraSocial().toString());
		System.out.println("jubilacion"  + this.aportesJubilatorios().toString());
		System.out.println("sueldo bruto"  + this.sueldoBruto().toString());
		System.out.println("sueldo neto"  + this.sueldoNeto().toString());
	}
}
