package tp2;

import java.util.Date;


public abstract class Empleado {
	String nombre;
	String direccion;
	String estadoCivil;
	String fechaDeNacimiento;
	Float sueldoBasico;
	
	public Long calcularEdad(){
		Date fechaHoy = new Date();
		Long fechaNacimineto = Date.parse(getFechaDeNacimiento());
	    return fechaHoy.getYear() - fechaNacimineto;
	}
	
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(Float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Float porcentajeDelSueldo(Float sueldo, Float porcentaje) {
		return (sueldo * porcentaje) / 100;
	}	
	
	public Float sueldoBruto() {
		return this.sueldoBasico;
	}
	
	public Float sueldoNeto() {
		return this.sueldoBasico;
	}
	
	public Float retenciones() {
		return (float) 0;
	}
	
	public   abstract void desgloce();
}
