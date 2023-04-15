package tp2;

public  class DesgloceConceptos {
	Empleado empleado;
	
	public  DesgloceConceptos(Empleado empleado) {
		setEmpleado(empleado);
	}
	
	private void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	private Empleado getEmpelado() {
		return this.empleado;
	}
	
	
	public void imprimirDesgloce(){
		this.getEmpelado().desgloce();
	}
	
	
}
