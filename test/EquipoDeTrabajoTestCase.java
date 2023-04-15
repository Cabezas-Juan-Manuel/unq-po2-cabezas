import tp3.PersonaEj11;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp3.EquipoDeTrabajo;

public class EquipoDeTrabajoTestCase {
	
	private EquipoDeTrabajo equipoDeTrabajo;
	
	// @throws Exception 
	
	@BeforeEach
	
	public void setup() throws Exception{
		// se instancia el equipo de trabajo
		equipoDeTrabajo = new EquipoDeTrabajo("Quilmes", new ArrayList <PersonaEj11>());
		// se instancian los integrantes
		PersonaEj11 integrante1 = new PersonaEj11("Rodrigo", "Brania", 44);
		PersonaEj11 integrante2 = new PersonaEj11("Sebastian", "Romero", 44);
		PersonaEj11 integrante3 = new PersonaEj11("Miguel", "Caneo", 39);
		PersonaEj11 integrante4 = new PersonaEj11("Walter", "Benitez", 30);
		PersonaEj11 integrante5 = new PersonaEj11("Pablo", "Garnier", 42);
		// se agregan los integrantes al equipo 
		equipoDeTrabajo.agregarPersonaAIntegrantes(integrante1);
		equipoDeTrabajo.agregarPersonaAIntegrantes(integrante2);
		equipoDeTrabajo.agregarPersonaAIntegrantes(integrante3);
		equipoDeTrabajo.agregarPersonaAIntegrantes(integrante4);
		equipoDeTrabajo.agregarPersonaAIntegrantes(integrante5);
		
	}
	
	@Test
	
	
	public void testEvenNumbers() {
		// test edad promedio
		Float edadPromedio = equipoDeTrabajo.edadPromedioDeEquipo();
		assertEquals((float)edadPromedio.intValue(), 39);
		PersonaEj11 nuevoIntegrante = new PersonaEj11("Claudio", "Bieler", 39);
		// test agregar un integrante
		this.equipoDeTrabajo.agregarPersonaAIntegrantes(nuevoIntegrante);
		assertEquals(this.equipoDeTrabajo.getIntegrantes().size(), 6);
	}	
	
}
