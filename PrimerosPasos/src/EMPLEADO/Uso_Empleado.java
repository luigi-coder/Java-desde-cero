package EMPLEADO;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado [] empleados = new Empleado[4];
		
		empleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		empleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		empleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		empleados[3] = new Empleado("Luisito");
		
		for(int i=0; i<empleados.length; i++) {
			
			empleados[i].subirSueldo(10);
		}
		for(int i=0; i<empleados.length; i++) {
			
			System.out.println(
					"Nombre: " + empleados[i].getNombre() + "\n" + 
					"Sueldo: " + empleados[i].getSueldo() + "\n" + 
					"Alta de Contrato: " + empleados[i].getAltaContrato() + "\n");
		}
	}

}
