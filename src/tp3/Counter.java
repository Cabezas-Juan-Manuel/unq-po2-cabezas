package tp3;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Counter {
	
	private ArrayList <Integer> numeros = new ArrayList <Integer> ();
	
	int numeroEntero = 0;
	
	Integer objetoNumero;
	
	public Counter(ArrayList <Integer> numerosElegidos){
		numeros = numerosElegidos;
	}
	
	public Counter(){
	
	}
	
	public void addNumber(int numero){
		numeros.add(numero);
	}
	
	public int getNumeroEntero(){
		return numeroEntero;
	}
	
	public Integer getobjetoNumero(){
		return objetoNumero;
	}
	
	
	public Long contarNumerosPares(){
		
		return numeros.stream().
				filter(numero -> numero.intValue() % 2 == 0).
				collect(Collectors.counting());
	}
	
	/*
	public boolean variablesSinInicializar(){
		int a;
		Integer c;
		return (a == 0 && c == null);
	}*/
	
	
	public Long contarNumerosImpares() {
		return numeros.stream().
				filter(numero -> numero.intValue() % 2 != 0).
				collect(Collectors.counting());
	}
	
	public Long contarMultiplosDe(int multiplo){
		return numeros.stream().
				filter(numero -> numero.intValue() % multiplo == 0).
				collect(Collectors.counting());
	}
	/*
	public static int mayorCantidadDePares(ArrayList <Integer> numeros) {
		
	}
	*/
	public static int valorMultiploDe(int x, int y) {
		int numero;
		numero = 0;
		while(!(numero % x == 0 && numero % y == 0)) {
			numero =+ 1;
		}
		return numero;
	}
	
	/*s.lenght() --> 3
	 * t.lenght() --> error, nunca se declara t 
	 * a.toUpperCase ---> 'ABC'
	 * 1 + a --->  error, se esta sumando un int con un string
	 * Libertad.indexOf(r) ---> 4
	 * Universidad.LastIndexOf(i) -->  7
	 * (a.length() + a.startsWith("a") --> se esta sumando un int con un booleano 
	 * s == a --> true
	 *  a.substring(1,3).equals("bc") --> true
	 * */
	
	/*1 - Los tipos de datos primitivos son tipos de datos predefinidos por el lenguaje
	 * 2 - int es un tipo de dato heredado del lenguaje C mientras que Integer es una clase de java, es el wrapp de int
	 * 3 - int el predeterminado va a ser 0 y en Integer null
	 * 4 - linea 38, da error, pide inicializar las variables*/
	
	
}

