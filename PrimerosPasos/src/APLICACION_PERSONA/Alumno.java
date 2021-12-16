package APLICACION_PERSONA;

public class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nombre, String carrera) {
		
		super(nombre);
		this.carrera = carrera;
	}
	
	public String getCarrera() {
		
		return carrera;
	}
	public String getDescripcion() {
		
		return "*** Alumno *** \n" + 
			   "Carrera: " + carrera;
	}
}
