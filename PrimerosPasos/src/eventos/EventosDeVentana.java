package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventosDeVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana mimarco = new MarcoVentana();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana mimarco2 = new MarcoVentana();
		
		mimarco2.setVisible(true);
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		mimarco.setTitle("Ventana 1");
		mimarco2.setTitle("Ventana 2");
		
		mimarco.setBounds(300, 300, 500, 350);
		mimarco2.setBounds(900, 300, 500, 350);
		
	}

}

class MarcoVentana extends JFrame {
	
	public MarcoVentana() {
		
		// setTitle("Eventos de ventana");
		
		// setBounds(700,300,500,300);
		
		M_Ventana oyente = new M_Ventana();
		
		addWindowListener(oyente);
		
	}
}


// Clase oyente 
class M_Ventana implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana abierta");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana cerrando");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("La ventana ha sido cerrada...");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana minima");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana restaurada");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana activada");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana desactivada");
	}
	
}
