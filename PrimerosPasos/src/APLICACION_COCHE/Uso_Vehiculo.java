package APLICACION_COCHE;

// Realizamos modularizacion desde la clase coche
// Las clases se comunican entre si mediante metodos

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creando un objeto de tipo Coche
		Coche coche = new Coche();
		
		// Creando un objeto de tipo Furgoneta
		Furgoneta furgoneta = new Furgoneta(600, 7);
		
		// Modificando propiedades del objeto coche
		coche.setLargo(3000); // Podemos usar JOptionPane
		coche.setColor("Azul");
		coche.setAsientosCuero("si");
		coche.setClimatizador("si");
		coche.setPesoTotal();
		
		// Modificando propiedades del objeto furgoneta
		furgoneta.setLargo(3000); // Podemos usar JOptionPane
		furgoneta.setColor("Azul");
		furgoneta.setAsientosCuero("si");
		furgoneta.setClimatizador("si");
		furgoneta.setPesoTotal();
		
		
		// En lugar de renault.rueda ahora y uso .getRueda
		// es de esa manera como se conectan las clases.
		System.out.println("COCHE \n" +
						   "Ruedas: " + coche.getRueda() + 
						   "\n" + 
				           "Largo: " + coche.getLargo() + 
				           " cm. \n" +
				           "Ancho: " + coche.getAncho() + 
				           " cm. \n" + 
				           "Motor: " + coche.getMotor() + 
				           "\n" +
				           "Peso de la plataforma: " + coche.getPesoPlataforma() + 
				           " Kg. \n" + 
				           "Color: " + coche.getColor() + 
				           "\n" + 
				           "Asientos de cuero: " + coche.getAsientosCuero() +
				           "\n" + 
				           "Climatizador: " + coche.getClimatizador() + 
				           "\n" +
				           "Peso total del vehiculo: " + coche.getPesoTotal() + " Kg." + 
				           "\n" + 
				           "Precio final: " + coche.PrecioCoche() + "$ \n");
		
		System.out.println("FURGONETA \n" +
						   "Ruedas: " + furgoneta.getRueda() + 
						   "\n" + 
				           "Largo: " + furgoneta.getLargo() + 
				           " cm. \n" +
				           "Ancho: " + furgoneta.getAncho() + 
				           " cm. \n" + 
				           "Motor: " + furgoneta.getMotor() + 
				           "\n" +
				           "Peso de la plataforma: " + furgoneta.getPesoPlataforma() + 
				           " Kg. \n" + 
				           "Color: " + furgoneta.getColor() + 
				           "\n" + 
				           "Asientos de cuero: " + furgoneta.getAsientosCuero() +
				           "\n" + 
				           "Climatizador: " + furgoneta.getClimatizador() + 
				           "\n" +
				           "Capacidad carga: " + furgoneta.getCapacidadCarga() +
				           "\n" +
				           "Plazas extra: " + furgoneta.getPlazasExtra() + 
				           "\n" +
				           "Peso total del vehiculo: " + furgoneta.getPesoTotal() + " Kg." + 
				           "\n" + 
				           "Precio final: " + furgoneta.PrecioCoche() + "$ \n");
		
	}

}
