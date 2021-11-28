package APLICACION_EMPLEADO;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jefatura jefeRRHH = new Jefatura("Luis", 55000, 2006, 9, 25);
		
		jefeRRHH.setIncentivo(6700);
		
		// Agregamos un elementos mas al array
		Empleado [] empleados = new Empleado[6];
		
		empleados[0] = new Empleado("Ana", 30000, 2000, 7, 7);
		empleados[1] = new Empleado("Carlos", 50000, 1995, 6, 15);
		empleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
		empleados[3] = new Empleado("Luisito", 47500, 2009, 11, 9);
		empleados[4] = jefeRRHH; // Polimorfismo en accion. Principio de sustitucion 
		// Podemos usar un objeto de la subclase cuando el programa espere un objeto
		// de la super clase
		empleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);
		
		// Aplicando casting(refundicion de objetos)
		Jefatura jefaFinanzas = (Jefatura) empleados[5];
		jefaFinanzas.setIncentivo(55000);
		
		/*
		for(int i=0; i<empleados.length; i++) {
			
			empleados[i].subirSueldo(10);
		}
		for(int i=0; i<empleados.length; i++) {
			
			System.out.println(
					"Nombre: " + empleados[i].getNombre() + "\n" + 
					"Sueldo: " + empleados[i].getSueldo() + "\n" + 
					"Alta de Contrato: " + empleados[i].getAltaContrato() + "\n" +
					"Id: " + empleados[i].getId());
		}*/
		
		for(Empleado e: empleados) {
			
			e.subirSueldo(5);
		}
		
		for(Empleado e: empleados) {
			
			System.out.println(
					"Nombre: " + e.getNombre() + "\n" + 
					"Sueldo: " + e.getSueldo() + "\n" + 
					"Alta de Contrato: " + e.getAltaContrato() + "\n" +
					"Id: " + e.getId());
		}
	}

}
//