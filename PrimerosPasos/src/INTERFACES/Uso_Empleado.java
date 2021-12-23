package INTERFACES;

import java.util.Arrays;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jefatura jefeRRHH = new Jefatura("Luis", 55000, 2006, 9, 25);
		
		jefeRRHH.setIncentivo(6700);
		
		Empleado [] empleados = new Empleado[6];
		
		empleados[0] = new Empleado("Ana", 30000, 2000, 7, 7);
		empleados[1] = new Empleado("Carlos", 50000, 1995, 6, 15);
		empleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
		empleados[3] = new Empleado("Luisito", 47500, 2009, 11, 9);
		empleados[4] = jefeRRHH;
		empleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);
		
	
		Jefatura jefaFinanzas = (Jefatura) empleados[5];
		jefaFinanzas.setIncentivo(55000);
		
		System.out.println(jefaFinanzas.tomarDecisiones("Despedir al operario Martin"));
			
		System.out.println("Jefe: " + jefaFinanzas.getNombre() + " " + jefaFinanzas.establecerBonus(500));
		
		System.out.println("Empleado: " + empleados[3].getNombre() + " " +empleados[3].establecerBonus(500));
		
		
		/* No se puede instanciar directamente una interfaces pero si que se
		   que es puede utlizar el principio de sustitucion de tal forma que 
		   si la clase empleado implementa la interfaces comparable, podemos
		   crearnos una instancia perteneciente a la interfaces pero luego a 
		   la hora de instanciarla decirle que es de tipo Empleado */
		
		/* Comparable ejemplo = new Empleado("Elisabeth", 95000, 2011, 06, 07);
		
		
		// InstanceOf en accion 
		if(director_comercial instanceof Empleado) {
			
			System.out.println("Es de tipo jefatura");
		}
		
		if(ejemplo instanceof Comparable) {
			
			System.out.println("Implementa la interfaces comparable");
		}
		*/
		
		// ***********************************
		
		for(Empleado e: empleados) {
			
			e.subirSueldo(5);
		}
		
		// Ordena un array de objetos
		/* Para usar el metodo sort la clase debe implementar la 
		 * interface Comparable y asu vez reescriba el metodo 
		 * compareTo() */
		Arrays.sort(empleados);
		/* Sort nos obliga que el tipo a ordenar implemente la 
		 * interface comparable */
		
		for(Empleado e: empleados) {
			
			System.out.println(
					"Nombre: " + e.getNombre() + "\n" + 
					"Sueldo: " + e.getSueldo() + "\n" + 
					"Alta de Contrato: " + e.getAltaContrato() + "\n" +
					"Id: " + e.getId());
		}
	}

}
