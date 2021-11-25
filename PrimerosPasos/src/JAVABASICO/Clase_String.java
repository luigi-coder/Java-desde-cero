package JAVABASICO;

public class Clase_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Luis"; // nombre es un objeto
		char letra = nombre.charAt(0);
		int longitud = nombre.length();
		System.out.println("Mi nombre es " + nombre + " y tiene " + longitud +
						   " letras" + "\n" + 
						   "Mi nombre empieza con " + letra + "\n" + 
						   "Mi nombre termina con " + nombre.charAt(longitud-1));
		
		// Metodo subString
		String frase = "Hoy es un hermoso dia para ir a la playa";
		String frase_corta = frase.substring(0, 21);
		System.out.println(frase_corta + " para programar");
		
		// Metodo equals
		String alumno1, alumno2;
		alumno1 = "david";
		alumno2 = "David";
		boolean resultado = alumno1.equals(alumno2);
		boolean resultado2 = alumno1.equalsIgnoreCase(alumno2);
		
		System.out.println(resultado);
		System.out.println(resultado2);
		
	}

}

// \n