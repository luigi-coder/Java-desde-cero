package APLICACION_EMPLEADO;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
	
	private String nombre;
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
		
		this.nombre = nombre;
		
		this.sueldo = sueldo;
		
		GregorianCalendar calendario = new GregorianCalendar(
				anio, 
				mes-1, 
				dia);
		
		this.altaContrato = calendario.getTime();
		
		++IdSiguiente;
		Id = IdSiguiente;
	}
	
	/* Una sobrecarga de constructores implica que que puede 
	 * variso metodos con el mismo nombre, pero tiene que tener
	 * diferente numero de argumentos */
	
	// Contruyendo un segundo constructor para darle un valor
	// inicial diferente, por ejemplo pasarle menos o mas 
	// parametros 
	public Empleado(String nombre) {
		
		this(nombre, 30000, 2000, 01, 01);
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	// Cuando colocamos la palabra final en un
	// metodo, el mismo no se puede usar en una 
	// subclase, osea no se puede sobreescribir.
	// public final double getSueldo()
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
	
	
}
