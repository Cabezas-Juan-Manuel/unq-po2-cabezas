package tp4;
import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String domicilio;
	ArrayList <Producto> productos = new ArrayList <Producto>();
	
	public Supermercado(String nombre, String domicilio, ArrayList <Producto> productos){
		this.setNombre(nombre);
		this.setDomicilio(domicilio);
		this.setProductos(productos);
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	private void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public Integer cantidadTotalDeProductos() {
		return this.productos.size();
	}
	
	public Float sumaTotalDeProductos() {
		Float total = (float) 0;
		for(int i = 0; i < this.productos.size(); i++) {
			total += this.productos.get(i).getPrecio();
		}
		return total;
	}
}
