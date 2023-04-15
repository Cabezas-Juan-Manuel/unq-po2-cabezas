package tp3;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaDeNacimiento;
	
	public Persona(String nombre, Calendar fechaDeNacimiento) {
		this.setNombre(nombre);
		this.setFechaDeNacimiento(fechaDeNacimiento);
	}
	
	

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	private void setFechaDeNacimiento(Calendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	private Integer edad() { // preguntar por error en year
		Calendar fechaActual = Calendar.getInstance();
		return (this.getFechaDeNacimiento().YEAR - fechaActual.YEAR);
	}
	
	public Boolean esMenorQue(Persona persona) {
		return this.edad() < persona.edad();
	}
}
