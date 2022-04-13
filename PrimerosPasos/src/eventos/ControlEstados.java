package eventos;


import java.awt.event.*;

import java.awt.Frame;
import javax.swing.JFrame;

public class ControlEstados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoControlEstado mimarco = new MarcoControlEstado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoControlEstado extends JFrame{

	public MarcoControlEstado() {
		
		setVisible(true);
		
		setBounds(300,300,500,350);
		
		// addWindowStateListener estar a la escucha 
		// del nuevo estado (new MensajeEstado())
		addWindowStateListener(new MensajeEstado());
	}

}


class MensajeEstado extends WindowAdapter {

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) {
			
			System.out.println("La ventana esta a pantalla completa");
			
		}else if(e.getNewState()==Frame.NORMAL) {
			
			System.out.println("La ventana esta normal");
			
		}else if (e.getNewState()==Frame.ICONIFIED) {
			
			System.out.println("La ventana esta minimizada");
		}
	}
	
}













