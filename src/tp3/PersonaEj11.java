package tp3;

public class PersonaEj11 {
	String nombre;
	String apellido;
	Integer edad;
	
	public PersonaEj11(String nombre, String apellido, Integer edad) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
}
