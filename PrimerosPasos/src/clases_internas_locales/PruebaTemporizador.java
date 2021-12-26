package clases_internas_locales;

import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj reloj = new Reloj();
		
		reloj.enMarcha(2000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsar Aceptar para terminar");
		
		System.exit(0);
	}

}













