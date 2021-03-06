package APLICACION_EMPLEADO;

// Colocando la palabra final en una clase 
// evitamos que se genere la herencia 
class Jefatura extends Empleado {
	
	private double incentivo; 
	
	public Jefatura(
			String nombre, 
			double sueldo, 
			int anio, 
			int mes, 
			int dia) {
		
		super(nombre, sueldo, anio, mes, dia);
		
	}
	
	public double getIncentivo() {
		
		return incentivo;
	}
	public void setIncentivo(double incentivo) {
		
		this.incentivo = incentivo;
	}
	
	@Override
	public double getSueldo() {
		// Cuando sobreescribimos un metodo debemos 
		// tambien de usar la palabra super()
		double sueldoJefe = super.getSueldo();
		
		return sueldoJefe + incentivo;
	}
	
}
