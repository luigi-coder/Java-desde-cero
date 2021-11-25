package JAVABASICO;
import java.util.Scanner;

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Metodo random()
		
		int numeroAleatorio = (int)Math.round(Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		int intentos = 0;
		/*
		while(numero!=numeroAleatorio){
			
			intentos++;
			System.out.println("Ingresa un numero: ");
			
			numero = entrada.nextInt();
			
			if(numeroAleatorio < numero) {
				System.out.println("Mas bajo");
			}else if(numeroAleatorio > numero) {
				System.out.println("Mas alto");
			}
		}
		*/
		
		do {
			
			intentos++;
			System.out.println("Ingresa un numero: ");
			
			numero = entrada.nextInt();
			
			if(numeroAleatorio < numero) {
				System.out.println("Mas bajo");
			}else if(numeroAleatorio > numero) {
				System.out.println("Mas alto");
			}
			
		}while(numero!=numeroAleatorio);
		
		System.out.println("Correcto");
		System.out.println("Lo lograste en " + intentos + " intentos");
	}

}
