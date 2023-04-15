package tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	String nombre;
	ArrayList <PersonaEj11> integrantes = new ArrayList<PersonaEj11>();
	
	public EquipoDeTrabajo(String nombre, ArrayList<PersonaEj11> integrantes) {
		this.setNombre(nombre);
		this.setIntegrantes(integrantes);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setIntegrantes(ArrayList<PersonaEj11> integrantes) {
		this.integrantes = integrantes;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public ArrayList <PersonaEj11> getIntegrantes(){
		return this.integrantes;
	}
	
	
	public Float edadPromedioDeEquipo() { // ver si se puede mejorar
		Float sumaDeEdades = (float) 0;
		for(int i = 0; i < this.integrantes.size(); i++) {
			sumaDeEdades += this.integrantes.get(i).edad;
		}
		return sumaDeEdades / this.integrantes.size();
	}
	
	public void agregarPersonaAIntegrantes(PersonaEj11 persona) {
		this.integrantes.add(persona);
	}
	
}


