package programacion_generica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.ensureCapacity(4); // Le ponemos un limite al ArrayList
		
		listaPersonas.add(new Persona(1,"Gabriel",33));
	    listaPersonas.add(new Persona(2,"Lucy",12));
	    listaPersonas.add(new Persona(3,"Guillermo",54));
	    listaPersonas.add(new Persona(4,"Luisina",29));
	    
	    System.out.print("ArrayList: { ");
	    
	    for (Persona persona : listaPersonas) {
			
	    	System.out.print(persona.getNombre() + ", ");
		}
	    
	    System.out.println("}");
	    
	    // Agregamos elemento en el indice indicado del ArrayList
	    listaPersonas.add(0, new Persona(5,"Luis",30));
	    
	    // Reemplazar un elemento en concreto de un Arraylist
	    listaPersonas.set(1, new Persona(6,"Nayely",19));
	    
	    // Obtener un elemento en concreto de un ArrayList
	    System.out.println("Elemento en una posicion en concreto: " + listaPersonas.get(4).getNombre());
	    
	    listaPersonas.trimToSize(); // Cerramos el ArrayList
	    
	    System.out.print("ArrayList modificado: { ");
	    
	    for (Persona persona : listaPersonas) {
			
	    	System.out.print(persona.getNombre() + ", ");
		}
	    
	    System.out.println("}");
	    
	    
	   // Traspasar los elementos del ArrayList a un vector
	   
	   Persona[] vectorPersonas = new Persona[listaPersonas.size()];
	   
	   listaPersonas.toArray(vectorPersonas);
	   
	   System.out.print("Vector traspaso de ArrayList: [ ");
	   
	   for (int i = 0; i < vectorPersonas.length; i++) {
		   
		   System.out.print(vectorPersonas[i].getNombre() + ", ");
	   }
	   
	   System.out.print("]");
	}

}


class Persona {
	//Atributos
	private int id;
	private String nombre;
	private int edad;
	//Constructor por defecto
	public Persona(){}
	  //Constructor con parametos
	 public Persona(int valorID,String valorNombre, int valorEdad ){
	   this.id =valorID;
	   this.nombre=valorNombre;
	   this.edad= valorEdad;                
	 }
	// Atributos de la clase
	public void setID (int valorid) {
	   id = valorid;
	} 
	public int getID() { 
	   return id; 
	} 
	public void setNombre (String valorNombre) {
	   nombre = valorNombre;

	} 
	public String getNombre () { 
	   return nombre; 
	} 
	public void setEdad (int valorEdad) {
	   edad = valorEdad;
	} 
	public int getEdad() { 
	   return edad; 
	} 
}




