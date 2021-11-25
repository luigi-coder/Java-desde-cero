package APLICACION_PRUEBA;

public class Empleados {

	private final String nombre;
	private int id;
	private static int idSiguiente=1;
	private String seccion;
	
	public Empleados(String nombre){
		
		this.nombre = nombre;
		this.seccion = "Administracion";
		id=idSiguiente;
		idSiguiente++;
		
	}
	
	public String getNombre() {
		
		return nombre;
	}
	public int getId() {
		
		return id;
	}
	
	public String getSeccion() {
		
		return seccion;
	}
	
	public void setSeccion(String seccion) {
		
		this.seccion = seccion;
	}
	
	// Creando un metodo static 
	public static int getIdSiguiente() {
		
		return idSiguiente; 
	}
	
}
