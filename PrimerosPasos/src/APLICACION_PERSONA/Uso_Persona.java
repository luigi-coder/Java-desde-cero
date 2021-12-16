package APLICACION_PERSONA;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona [] personas = new Persona[2];
		
		personas[0] = new Empleado("Luis Salinas", 50000, 2009, 02, 25);
		personas[1] = new Alumno("Andy Invernizzi", "Ingenieria Industrial");
		
		for(Persona e:personas) {
			
			System.out.println(e.getDescripcion() + "\n" +
							   e.getNombre() + "\n");
		}
	}

}

