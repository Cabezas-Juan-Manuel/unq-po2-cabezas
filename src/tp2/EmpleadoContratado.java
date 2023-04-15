package tp2;

public class EmpleadoContratado extends Empleado {
	
	String numeroDeContrato;
	String medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, String fechaDeNacimiento, 
			Float sueldoBasico, String numeroDeContrato, String medioDePago) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setEstadoCivil(estadoCivil);
		this.setFechaDeNacimiento(fechaDeNacimiento);
		this.setSueldoBasico(sueldoBasico);
		this.setNumeroDeContrato(numeroDeContrato);
		this.setMedioDePago(medioDePago);
	}
	
	private void setNumeroDeContrato(String nro) {
		this.numeroDeContrato = nro;
	}
	
	private void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}
	
	public Float sueldoBruto() {
		return this.sueldoBasico;
	}
	
	public Float sueldoNeto() {
		return this.sueldoBruto() - 50;
	}
	
	public void desgloce() {
		System.out.println("sueldo Basico"  + this.getSueldoBasico().toString());
		System.out.println("sueldo Bruto"  + this.sueldoBruto().toString());
		System.out.println("Descuento constante  50");
		System.out.println("sueldo Neto"  + this.sueldoNeto().toString());
	}
}
