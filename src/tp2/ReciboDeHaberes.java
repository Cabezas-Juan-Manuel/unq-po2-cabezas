package tp2;

import java.util.Calendar;

public class ReciboDeHaberes {
	String nombreDeEmpleado;
	String direccion;
	Calendar fechaDeEmision;
	Float sueldoBruto;
	Float sueldoNeto;
	DesgloceConceptos desgloceDeConceptos;
	
	public ReciboDeHaberes(String nombre, String direccion, Calendar fechaDeEmision, 
			Float sueldoBruto, Float sueldoNeto, DesgloceConceptos desgloceDeConceptos) {
		this.setNombreDeEmpleado(nombre);
		this.setDireccion(direccion);
		this.setFechaDeEmision(fechaDeEmision);
		this.setSueldoBruto(sueldoBruto);
		this.setSueldoNeto(sueldoNeto);
		this.setDesgloceDeConceptos(desgloceDeConceptos);
	}
	

	public void setNombreDeEmpleado(String nombreDeEmpleado) {
		this.nombreDeEmpleado = nombreDeEmpleado;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setFechaDeEmision(Calendar fechaDeEmision) {
		this.fechaDeEmision = fechaDeEmision;
	}
	
	public void setSueldoBruto(Float sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	
	public void setSueldoNeto(Float sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}
	
	public void setDesgloceDeConceptos(DesgloceConceptos desgloceDeConceptos) {
		this.desgloceDeConceptos = desgloceDeConceptos;
	}
	
	public DesgloceConceptos getDesgloceConceptos() {
		return this.desgloceDeConceptos;
	}
	
	public void mostrarDesgloce() {
		this.getDesgloceConceptos().imprimirDesgloce();
	}
}
