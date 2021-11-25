package JAVABASICO;
import java.util.Scanner;

public class Tipo_Entrenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Hola!, para una mejor atencion ingresa tu nombre: ");
		
		String nombre = entrada.nextLine();
		
		System.out.println("Bienvenido " + nombre + "\n" +
						   "Porfavor elegi el metodo de pago \n" + 
						   "EFECTIVO - 1 " + "\n" + 
						   "TARJETA - 2");
		int metodo = entrada.nextInt();
		
		switch(metodo) {
		
		case 1:
			System.out.println("Elegiste el metodo de pago EFECTIVO \n" + 
							   "Porfavor seleccion el plan que mas te convenga \n" + 
							   "3 meses $9420 ($3080 x mes) - 1 \n" +
							   "6 meses $16380 ($2730 x mes) - 2 \n" +
							   "12 mese $28560 ($2380 x mes) - 3");
			
			int opcionEfectivo = entrada.nextInt();
			
			Scanner entrada2 = new Scanner(System.in);
			
			switch(opcionEfectivo) {
			
			case 1:
				System.out.println("Importe a pagar $9420 \n" + 
								   "confirmar el pago (SI - NO)");
				String confirma1 = entrada2.nextLine();
				
				if(confirma1.equalsIgnoreCase("si")) {
					System.out.println("Bienvenido " + nombre + 
									   " ahora nuevo socio de Dynami, gracias por elegirnos");
				}else if(confirma1.equalsIgnoreCase("no")) {
					System.out.println(nombre + " Lo sentimos no completaste el pago, vuelve cuando quieras");
				}
			break;
			case 2:
				
				System.out.println("Importe a pagar $16380 \n" + 
								   "confirmar el pago (SI - NO)");
				String confirma2 = entrada2.nextLine();
				
				if(confirma2.equalsIgnoreCase("si")) {
					System.out.println("Bienvenido " + nombre + 
									   " ahora nuevo socio de Dynami, gracias por elegirnos");
				}else if(confirma2.equalsIgnoreCase("no")) {
					System.out.println(nombre + " Lo sentimos no completaste el pago, vuelve cuando quieras");
				}
			break;
			case 3:
				
				System.out.println("Importe a pagar $28560 \n" + 
								   "confirmar el pago (SI - NO)");
				String confirma3 = entrada2.nextLine();
				
				if(confirma3.equalsIgnoreCase("si")) {
					System.out.println("Bienvenido " + nombre + 
									   " ahora nuevo socio de Dynami, gracias por elegirnos");
				}else if(confirma3.equalsIgnoreCase("no")) {
					System.out.println(nombre + " Lo sentimos no completaste el pago, vuelve cuando quieras");
				}
			break;
			
			}
		break;
		case 2: 
			System.out.println("Elegiste el metodo de pago TARJETA \n" + 
					   "Porfavor seleccion el plan que mas te convenga \n" + 
					   "3 meses $10165 ($3338 x mes) - 1 \n" +
					   "6 meses $18020 ($3003 x mes) - 2 \n" +
					   "12 meses $31415 ($2617 x mes) - 3");
			
			int opcionTarjeta = entrada.nextInt();
			
			Scanner entrada3 = new Scanner(System.in);
			
			switch(opcionTarjeta) {
			
			case 1:
				
				System.out.println("Importe a pagar $10165 \n" + 
								   "confirmar el pago (SI - NO)");
				String confirma1 = entrada3.nextLine();
				
				if(confirma1.equalsIgnoreCase("si")) {
					System.out.println("Bienvenido " + nombre + 
									   " ahora nuevo socio de Dynami, gracias por elegirnos");
				}else if(confirma1.equalsIgnoreCase("no")) {
					System.out.println(nombre + " Lo sentimos no completaste el pago, vuelve cuando quieras");
				}
			break;
			case 2:
				
				System.out.println("Importe a pagar $18020 \n" + 
								   "confirmar el pago (SI - NO)");
				String confirma2 = entrada3.nextLine();
				
				if(confirma2.equalsIgnoreCase("si")) {
					System.out.println("Bienvenido " + nombre + 
									   " ahora nuevo socio de Dynami, gracias por elegirnos");
				}else if(confirma2.equalsIgnoreCase("no")) {
					System.out.println(nombre + " Lo sentimos no completaste el pago, vuelve cuando quieras");
				}
			break;
			case 3:
				
				System.out.println("Importe a pagar $31415 \n" + 
								   "confirmar el pago (SI - NO)");
				String confirma3 = entrada3.nextLine();
				
				if(confirma3.equalsIgnoreCase("si")) {
					System.out.println("Bienvenido " + nombre + 
									   " ahora nuevo socio de Dynami, gracias por elegirnos");
				}else if(confirma3.equalsIgnoreCase("no")) {
					System.out.println(nombre + " Lo sentimos no completaste el pago, vuelve cuando quieras");
				}
			break;
			
			}
		break;
		default:
			System.out.println("Valor ingresado incorrecto, por favor elija la opcion 1 o 2");
			
		}
		
	}

}
