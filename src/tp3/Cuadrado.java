package tp3;

public class Cuadrado{
	Rectangulo rectangulo;
	public Cuadrado(Punto punto, Float lado) {
		setRectangulo(new Rectangulo(punto, lado, lado));
	}
	
	private void setRectangulo(Rectangulo rectangulo){
		this.rectangulo = rectangulo;
	}
	
	
	private Rectangulo getRectangulo() {
		return this.rectangulo;
	}
	
	public Float calcularArea() {
		return this.getRectangulo().areaRectangulo();
	}
	
	public Float calcularPerimetro() {
		return this.getRectangulo().perimetroRectangulo();
	}
		
}
