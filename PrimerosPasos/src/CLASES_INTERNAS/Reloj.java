package CLASES_INTERNAS;

import java.awt.event.*;
import java.util.Date;

import javax.swing.Timer;
import java.awt.Toolkit;

public class Reloj{
	
	private int intervalo;
	private boolean sonido;
	
	// Clase interna
	private class DameLaHora implements ActionListener{
		
		public void actionPerformed(ActionEvent evento) {
			
			Date ahora = new Date();
			
			System.out.println("Hora cada 2seg " + ahora);
			
			if(sonido) {
				
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	
	// Constructor
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo = intervalo;
		this.sonido = sonido;
		
	}
	
	public void enMarcha() {
		
		ActionListener oyente = new DameLaHora();
		
		// Primer arg: intervalo
		// Segundo arg: objeto de tipo ActionListener
		
		Timer temporizador = new Timer(intervalo,oyente);
		
		temporizador.start();
	}
	
	
}















