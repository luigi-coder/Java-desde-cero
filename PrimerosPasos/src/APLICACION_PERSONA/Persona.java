package APLICACION_PERSONA;

public abstract class Persona {
	
	private String nombre;
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getNombre() {
		
		return "Nombre: " + nombre;
	}
	
	// Metodo abstracto pq la descripcion
	// no sera la misma para empleado que
	// para alumno
	public abstract String getDescripcion();
}
