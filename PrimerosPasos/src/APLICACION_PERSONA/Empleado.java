package APLICACION_PERSONA;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona{
	
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
	public Empleado(
			String nombre, 
			double sueldo, 
			int anio, 
			int mes, 
			int dia) {
		
		super(nombre);
		this.sueldo = sueldo;
		
		GregorianCalendar calendario = new GregorianCalendar(
				anio, mes-1, dia);
		
		this.altaContrato = calendario.getTime();
		
		++IdSiguiente;
		Id = IdSiguiente;
	}
	
	public double getSueldo() {
		
		return sueldo;
	}
	
	public Date getAltaContrato() {
		
		return altaContrato;
	}
	
	public int getId() {
		
		return Id;
	}
	
	public void subirSueldo(double porcentaje) {
		
		double aumento = sueldo * porcentaje/100;
		
		sueldo += aumento;
		
	}
	
	public String getDescripcion() {
		
		return "*** Empleado *** \n" + 
			   "Id: " + Id + "\n" +
			   "Sueldo: " + sueldo;
	}
}
















