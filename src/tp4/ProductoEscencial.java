package tp4;

public class ProductoEscencial extends Producto {
	
	Float precioConDescuento;
	
	public ProductoEscencial(String nombre, Float precio, Integer porcentajeDescuento) {
		super(nombre, precio);
		this.setPrecioConDescuento(porcentajeDescuento);
	}
		
	private void setPrecioConDescuento(Integer porcentaje) {
		this.precioConDescuento = (this.getPrecio() * porcentaje) / 100;
	}
		
}


