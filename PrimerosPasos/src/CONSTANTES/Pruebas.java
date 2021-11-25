package CONSTANTES;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados empleado1 = new Empleados("Luis");
		Empleados empleado2 = new Empleados("Andy");
		Empleados empleado3 = new Empleados("Emma");
		
		empleado3.setSeccion("RRHH");
		
		
		System.out.println(
				"Nombre: " + empleado1.getNombre() + "\n" +
				"Seccion: " + empleado1.getSeccion() + "\n" + 
				"ID: " + empleado1.getId());
		
		System.out.println(
				"Nombre: " + empleado2.getNombre() + "\n" +
				"Seccion: " + empleado2.getSeccion() + "\n" + 
				"ID: " + empleado2.getId() + "\n");
		
		System.out.println(
				"Nombre: " + empleado3.getNombre() + "\n" +
				"Seccion: " + empleado3.getSeccion() + "\n" + 
				"ID: " + empleado3.getId() + "\n");
		
		// Llamando al metodo static 
		System.out.println("ID Siguiente: " + Empleados.getIdSiguiente());
		
	}

}

