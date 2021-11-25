package APLICACION_COCHE;

public class Coche {
	
	// Encapsulacion 
	// los atributos solo puede ser modificadas 
	// desde la propia clase
	// private es un modificador de acceso
	
	private int ruedas; // Encapsulando la propiedad
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	// Propiedades del coche que pueden variar
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero;
	
	private boolean climatizador;
	
	// Constructor
	public Coche() {
		
		ruedas = 4;
		
		largo = 2000;
		
		ancho = 300;
		
		motor = 1600;
		
		peso_plataforma = 500;
	}
	
	// Los METODOS nos permiten que nuestras clases interactuen entre si
	// formando una unidad para que un programa funcione.
	
	public int getRueda() {
		
		return ruedas;
	}
					  // Paso por parametro
	public void setRueda(int ruedas) {
		
		this.ruedas = ruedas;
	}
	
	public int getLargo() {
		
		return largo;
	}
	
	public void setLargo(int largo) {
		
		this.largo = largo;
	}
	
	public int getAncho() {
		
		return ancho;
	}
	
	public void setAncho(int ancho) {
		
		this.ancho = ancho;
	}
	public int getMotor() {
		
		return motor;
	}
	
	public void setMotor(int motor) {
		
		this.motor = motor;
	}
	public int getPesoPlataforma() {
		
		return peso_plataforma;
	}
	
	public void setPesoPlataforma(int peso_plataforma) {
		
		this.peso_plataforma = peso_plataforma;
	}
	
	public String getColor() {
		
		return color;
	}
	
	public void setColor(String color) {
		
		this.color = color;
	}
	
	
	public String getAsientosCuero() {
		
		// Si da rojo de error lo que pasa es que este 
		// metodo tiene que devolver si o si un string
		// por eso es importante tambien poner el else
		
		if(asientos_cuero) {
			
			return "Si";
			
		}else {
			
			return "No";
		}
	}
	
	public void setAsientosCuero(String asientos_cuero) {
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			
			this.asientos_cuero = true;
			
		}else {
			
			this.asientos_cuero = false;
		}
	}
	
	public String getClimatizador() {
		
		if(climatizador) {
			
			return "Si";
			
		}else {
			
			return "No";
		}
	}
	
	public void setClimatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("si")) {
			
			this.climatizador = true;
			
		}else {
			
			this.climatizador = false;
		}
	}
	
	public int getPesoTotal() {
		
		return peso_total;
	}
	
	public void setPesoTotal() {
		
		int peso_carroceria = 500;
		
		this.peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero) {
			
			peso_total += 50;
		}
		if(climatizador) {
			
			peso_total += 20;
		}
		
	}
	
	// Getter
	public int PrecioCoche() {
		
		int precio_final = 10000;
		
		if(asientos_cuero) {
			
			precio_final += 2000;
		}
		if(climatizador) {
			
			precio_final += 1500;
		}
		
		return precio_final;
	}
}
















