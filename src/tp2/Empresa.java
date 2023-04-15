package tp2;

import java.util.ArrayList;
import java.util.Calendar;

public class Empresa {
	String nombreEmpresa;
	
	String cuitEmpresa;
	
	public ArrayList <Empleado> empleados = new ArrayList <Empleado> ();
	
	public Empresa(String nombre, String cuit) {
		setNombreEmpresa(nombre);
		setCuitEmpresa(cuit);
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	public void setCuitEmpresa(String cuitEmpresa) {
		this.cuitEmpresa = cuitEmpresa;
	}
	
	public Float sueldosBrutosTotales() {
		Float sueldoBruto = (float) 0;
		for (int i = 0; i < this.empleados.size(); i++) {
			sueldoBruto = sueldoBruto + this.empleados.get(i).sueldoBruto();
		}
		return sueldoBruto;
	}
	
	public Float sueldoNetoTotales() {
		Float sueldoNeto = (float) 0;
		for (int i = 0; i < this.empleados.size(); i++) {
			sueldoNeto = sueldoNeto + this.empleados.get(i).sueldoNeto();
		}
		return sueldoNeto;
	}
	
	public Float retencionesTotales() {
		Float retenciones = (float) 0;
		for (int i= 0; i< this.empleados.size(); i++) {
			retenciones = retenciones + this.empleados.get(i).retenciones();
		}
		return retenciones;
	}
	
	
	public void crearReciboDeSueldoPara(Empleado empleado) {
		Calendar fechaRecibo = Calendar.getInstance();
		 new ReciboDeHaberes(empleado.nombre, empleado.direccion, fechaRecibo, empleado.sueldoBruto(), 
				empleado.sueldoNeto(), new DesgloceConceptos(empleado)); // falta desgloce;
	}
}
