package CLASES_INTERNAS;

import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj reloj = new Reloj(2000, true);
		
		reloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsar Aceptar para terminar");
		
		System.exit(0);
	}

}













