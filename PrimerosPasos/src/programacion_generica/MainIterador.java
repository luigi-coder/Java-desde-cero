package programacion_generica;

import java.util.ArrayList;

public class MainIterador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.ensureCapacity(4); // Le ponemos un limite al ArrayList
		
		listaPersonas.add(new Persona(1,"Gabriel",33));
	    listaPersonas.add(new Persona(2,"Lucy",12));
	    listaPersonas.add(new Persona(3,"Guillermo",54));
	    listaPersonas.add(new Persona(4,"Luisina",29));
	    
	}

}
