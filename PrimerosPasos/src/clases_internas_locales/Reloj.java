package clases_internas_locales;

import java.awt.event.*;
import java.util.Date;

import javax.swing.Timer;
import java.awt.Toolkit;

public class Reloj{
	
	public void enMarcha(int intervalo, final boolean sonido) {
		
		// Clase interna local no debe llevar ningun
		// modificador de acceso
		class DameLaHora implements ActionListener{
			
			public void actionPerformed(ActionEvent evento) {
				
				Date ahora = new Date();
				
				System.out.println("Hora cada 2seg " + ahora);
				
				if(sonido) {
					
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente = new DameLaHora();
		
		Timer temporizador = new Timer(intervalo,oyente);
		
		temporizador.start();
	}
	
	
}















