package paquetePrueba;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ClaseEjemplo {

	
	public static void main(String[] args) {
        // TODO code application logic here
        
		Stack<Integer> pila = new Stack<Integer>();
		
		System.out.println("Esta vacia la pila ? " + pila.empty());
		
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		
		for (Integer pil : pila) {
			System.out.println(pil);
		}
		
		pila.pop();
		
		System.out.println("¿Esta el numero en la pila?: " + pila.search(3));
		
		System.out.println(pila.peek());
		
    }
    
}

class Persona{
	
	int id;
	String nombre;
	int edad;
	
	public Persona(int id,String nombre, int edad) {

		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void setId(int id) {
		
		this.id = id;
	}
	public int getId() {
		
		return id;
	}
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	public String getNombre() {
		
		return nombre;
	}
	public void setEdad(int edad) {
		
		this.edad = edad;
	}
	public int getEdad() {
		
		return edad;
	}
}




/* 
Double vectorNotas[][] = new Double[4][4];

Scanner notas = new Scanner(System.in);

Double promedio = 0.0;

for (int i = 0; i < vectorNotas.length; i++) {
	for (int j = 0; j < vectorNotas.length-1; j++) {
		
			
		System.out.println(
				"Ingrese la nota del alumno de la fila " + i + 
				" y la columna " + j + ": ");
			
		vectorNotas[i][j] = notas.nextDouble();
		
		promedio += vectorNotas[i][j]/3;
		
	}
	
	vectorNotas[i][3] = promedio;
	promedio = 0.0;
}

for (int i = 0; i < vectorNotas.length; i++) {
	System.out.print("nota ");
	for (int j = 0; j < vectorNotas.length-1; j++) {
		
		System.out.print(vectorNotas[i][j] + "  ");
	}
	
	System.out.println("promedio = " + vectorNotas[i][vectorNotas.length-1]);
	System.out.println();
}*/
