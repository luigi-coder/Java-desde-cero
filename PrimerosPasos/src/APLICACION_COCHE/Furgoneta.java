package APLICACION_COCHE;

public class Furgoneta extends Coche {
	
	private int capacidad_carga;
	
	private int plazas_extra;
	
	public Furgoneta(int capacidad_carga, int plazas_extra) {
		
		super();
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
		
	}
	
	
	public int getCapacidadCarga() {
		
		return capacidad_carga;
	}
	public void setCapacidadCarga(int capacidad_carga) {
		
		this.capacidad_carga = capacidad_carga;
	}
	public int getPlazasExtra() {
		
		return plazas_extra;
	}
	public void setPlazasExtra(int plazas_extra) {
		
		this.plazas_extra = plazas_extra;
	}
}
