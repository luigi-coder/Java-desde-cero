package POOCOCHE;

// Realizamos modularizacion desde la clase coche
// Las clases se comunican entre si mediante metodos

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creando un objeto de tipo Coche
		Coche renault = new Coche();
		
		// Modificando una propiedad de un objeto con set
		renault.setLargo(3000); // Podemos usar JOptionPane
		renault.setColor("Azul");
		renault.setAsientosCuero("si");
		renault.setClimatizador("si");
		renault.setPesoTotal();
		
		// En lugar de renault.rueda ahora y uso .getRueda
		// es de esa manera como se conectan las clases.
		System.out.println("Ruedas: " + renault.getRueda() + 
						   "\n" + 
				           "Largo: " + renault.getLargo() + 
				           " cm. \n" +
				           "Ancho: " + renault.getAncho() + 
				           " cm. \n" + 
				           "Motor: " + renault.getMotor() + 
				           "\n" +
				           "Peso de la plataforma: " + renault.getPesoPlataforma() + 
				           " Kg. \n" + 
				           "Color: " + renault.getColor() + 
				           "\n" + 
				           "Asientos de cuero: " + renault.getAsientosCuero() +
				           "\n" + 
				           "Climatizador: " + renault.getClimatizador() + 
				           "\n" +
				           "Peso total del coche: " + renault.getPesoTotal() + " Kg." + 
				           "\n" + 
				           "Precio final: " + renault.PrecioCoche() + "$");
		
	}

}
