package PAQUETE_PRUEBAS_2;

import PAQUETE_PRUEBAS_1.Clase3;

public class Clase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clase1 miObj = new Clase1();
		
		Clase3 miObj2 = new Clase3();
		
		/* Si tratamos de acceder con el . 
		   con miObj2 a las variables o 
		   metodos, no se pueden acceder 
		   porque debemos debemos de usar 
		   el modificador de acceso de la
		   clase1 */
		
		System.out.println(miObj2.miMetodo());
		
	}

}
