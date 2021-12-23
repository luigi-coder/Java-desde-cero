package TEMPORIZADOR;

import java.awt.event.ActionEvent;
import java.awt.Toolkit;

import java.awt.event.ActionListener;
import java.util.Date;

public class DameHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
	
		Date ahora = new Date();
		
		System.out.println("Te pongo la hora cada 2seg: " + ahora);
		
		// Entra en los recursos de la pc y tira un sonido cada ves
		// que el cronometro se ejecuta
		Toolkit.getDefaultToolkit().beep();
		
	}

}