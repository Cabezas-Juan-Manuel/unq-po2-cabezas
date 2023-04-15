package tp4;

public class Producto {
	private String nombre;
	protected Float precio;
	private Boolean esPrecioCiudado;
	
	public Producto(String nombre, Float precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(false);
	}

	public Float getPrecio() {
		return this.precio;
	}

	protected void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Boolean getEsPrecioCiudado() {
		return esPrecioCiudado;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected void setEsPrecioCuidado(Boolean bool) {
		this.esPrecioCiudado = bool;
	}
	
	protected void pasarAPrecioCuidado() {
		this.setEsPrecioCuidado(true);
	}
}
