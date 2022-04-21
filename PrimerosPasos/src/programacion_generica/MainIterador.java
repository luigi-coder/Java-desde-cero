package programacion_generica;

import java.util.ArrayList;
import java.util.Iterator;

public class MainIterador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.ensureCapacity(4); // Le ponemos un limite al ArrayList
		
		listaPersonas.add(new Persona(1,"Gabriel",33));
	    listaPersonas.add(new Persona(2,"Lucy",12));
	    listaPersonas.add(new Persona(3,"Guillermo",54));
	    listaPersonas.add(new Persona(4,"Luisina",29));
	    
	    Iterator<Persona> iterator = listaPersonas.iterator();
	    
	    while (iterator.hasNext()) {
			
	    	System.out.println(iterator.next().getNombre());
			
		}
	    
	    for (Iterator<Persona> iterator2 = listaPersonas.iterator(); iterator2.hasNext();) {
			Persona persona = (Persona) iterator2.next();
			System.out.println(persona.getNombre());
			
		}
	    
	}

}
