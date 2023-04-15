package tp3;

import java.util.ArrayList;

public class MultiOperador {
	
	private ArrayList <Integer> numeros = new ArrayList <Integer> ();
	
	public Integer suma(){
		Integer suma = 0;
		for(int i = 0; i < this.numeros.size(); i++) {
			suma += numeros.get(i);
		}
		return suma;
	}
	
	
	public Integer resta(){
		Integer resta = numeros.get(0);
		for(int i = 1; i < this.numeros.size(); i++) {
			resta += numeros.get(i);
		}
		return resta;
	}
	
	public int multiplicacion(){
		Integer multiplicacion = this.numeros.get(0);
		for(int i = 1; i < this.numeros.size(); i++) {
			multiplicacion = multiplicacion * this.numeros.get(i);
		}
		return multiplicacion;
	}
}
