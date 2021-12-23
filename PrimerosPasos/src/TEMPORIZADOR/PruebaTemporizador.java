package TEMPORIZADOR;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameHora oyente = new DameHora();
		
		Timer temporizador = new Timer(2000, oyente);
		
		temporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		System.exit(0);
		
	}


}
