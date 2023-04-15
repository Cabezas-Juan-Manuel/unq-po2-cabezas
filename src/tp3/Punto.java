package tp3;

public class Punto {

	private float x;
	private float y;
	
	public Punto(float x, float y) {
		super();
		this.setXY(x, y);
		
	}
	
	public Punto() {
		this.setXY(0, 0);
	}
	
	public void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public void moverPuntoACoordenadas(float x, float y) {
		this.setXY(x, y);
	}
	
	public Punto crearNuevoSumandoA(float x, float y) {
		return new Punto(this.getX() + x, this.getY()+ y);
	}
}


