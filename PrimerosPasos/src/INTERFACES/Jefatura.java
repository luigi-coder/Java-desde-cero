package INTERFACES;

// Colocando la palabra final en una clase 
// evitamos que se genere la herencia 
public class Jefatura extends Empleado implements Jefes {
	
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

	@Override
	public String tomarDecisiones(String decision) {
		
		return "El jefe acaba de tomar una desicion: " + decision;
	}

	@Override
	public double establecerBonus(double bonus) {
		
		// Esta prima solo se la damos a jefe
		double prima = 2000;
		
		
		return Trabajadores.bonus_base + bonus + prima;
	}
	
}
