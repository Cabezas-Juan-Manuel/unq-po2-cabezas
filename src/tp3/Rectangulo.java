package tp3;

public class Rectangulo {
	private Float altura;
	private Float base;
	Punto  vertice1;
	Punto  vertice2;
	Punto  vertice3;
	Punto  vertice4;
	
	public Rectangulo(Punto punto1, Float ancho, Float alto){
		this.setVertice1(punto1);
		this.setVertice2(punto1.crearNuevoSumandoA(0, altura));
		this.setVertice3(punto1.crearNuevoSumandoA(base, 0));
		this.setVertice4(punto1.crearNuevoSumandoA(base, altura));
		this.setAltura(altura);
		this.setBase(base);

	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getBase() {
		return base;
	}

	public void setBase(Float base) {
		this.base = base;
	}

	public Punto getVertice1() {
		return vertice1;
	}

	public void setVertice1(Punto vertice1) {
		this.vertice1 = vertice1;
	}

	public Punto getVertice2() {
		return vertice2;
	}

	public void setVertice2(Punto vertice2) {
		this.vertice2 = vertice2;
	}

	public Punto getVertice3() {
		return vertice3;
	}

	public void setVertice3(Punto vertice3) {
		this.vertice3 = vertice3;
	}

	public Punto getVertice4() {
		return vertice4;
	}

	public void setVertice4(Punto vertice4) {
		this.vertice4 = vertice4;
	}
	
	public Float areaRectangulo() {
		return this.getAltura() * this.getBase();
	}
	
	public float perimetroRectangulo() {
		return this.getAltura() * 2 + this.getBase() * 2;
	}
	
	public void direccionDelRectangulo(){
		if(this.getBase() > this.getAltura()) {
			System.out.println("el rectangulo es horizontal");
		} else {
			System.out.print("el rectangulo es vertical");
		}
	}
}
	
