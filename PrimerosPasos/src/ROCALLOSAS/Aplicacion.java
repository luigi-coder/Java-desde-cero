package ROCALLOSAS;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		
		
		Alumno alumno = new Alumno();
		
		String [] nombres = new String [10];
		
		int [] notas1 = new int [10];
		int [] notas2 = new int [10];
		int [] notas3 = new int [10];
		int [] promedios = new int [10];
		
		
		System.out.println("NOMBRE DE LOS ALUMNOS");
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<nombres.length;i++) {
			

			System.out.println((i+1) + ".Nombre del alumno: ");
			
			nombres[i] = entrada.nextLine();
		
			alumno.setNombre(nombres[i]);
		}
		
		System.out.println();
		System.out.println("PRIMERAS NOTAS DE LOS ALUMNOS");

		// LLenado de la primera nota 
		
		for(int i=0; i<notas1.length;i++) {
			
			System.out.println("Primera nota del alumno " + nombres[i] + ": ");
			
			notas1[i] = entrada.nextInt();
			
			alumno.setNota(notas1[i]);

		}
		
		System.out.println();
		System.out.println("SEGUNDA NOTA DE LOS ALUMNOS");
		// Llenado de la segunda nota
		for(int i=0; i<notas2.length;i++) {
			
			System.out.println("Segunda nota del alumno " + nombres[i] + ": ");
			
			notas2[i] = entrada.nextInt();
			
			alumno.setNota(notas2[i]);

		}
		
		System.out.println();
		System.out.println("TERCERA NOTA DE LOS ALUMNOS");
		// Llenado de la tercera nota
		for(int i=0; i<notas3.length;i++) {
			
			System.out.println("Tercera nota del alumno " + nombres[i] + ": ");
			
			notas3[i] = entrada.nextInt();
			
			alumno.setNota(notas3[i]);

		}
		System.out.println();
		// Promedio
		for(int i=0; i<promedios.length; i++) {
			
			promedios[i] = (notas1[i]+notas2[i]+notas3[i])/3;
			
			alumno.setPromedio(promedios[i]);
		}
		
		
		for(int i=0; i<10; i++) {
			
			System.out.println(nombres[i] + "|  nota-01: " + 
							   notas1[i] + "| nota-02: " + 
							   notas2[i] + "| nota-03: " + 
							   notas3[i] + " | Promedio: " + 
							   promedios[i] + " | Estado: " + alumno.getPromedio());
		}
		
		
	}

}
