package ROCALLOSAS;

import org.junit.Test;

import junit.framework.TestCase;

public class AlumnoTest extends TestCase {
	
	@Test
	public void testGetPromedio() {
		
		Alumno alumno = new Alumno();
		
		// for
		for(int i=7; i<=10; i++) {
			
			alumno.setPromedio(i); // 7, 8, 9, 10
			
			assertEquals(alumno.getPromedio(),"Aprobado");
		}
		// for
		for(int i=6; i>0; i--) {
			
			alumno.setPromedio(i);
			
			assertEquals(alumno.getPromedio(),"Desaprobado");
		}
		
	}
}
