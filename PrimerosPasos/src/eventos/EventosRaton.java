package eventos;

import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEventosRaton marco = new MarcoEventosRaton();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoEventosRaton extends JFrame {
	
	public MarcoEventosRaton() {
		
		setVisible(true);
		
		setBounds(300,300,500,250);
		
		addMouseListener(new MensajeRaton());
		addMouseMotionListener(new MensajeRatonMovimiento());
	}
}

class MensajeRaton extends MouseAdapter {

	@Override
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getX());
		//System.out.println(e.getClickCount());
		
	}
	
	public void mousePressed(MouseEvent e) {
		
		System.out.println(e.getModifiersEx());
		
		if(e.getModifiersEx()==InputEvent.BUTTON1_DOWN_MASK) {
			
			System.out.println("Has pulsado el boton izquierdo...");
			
		}else if(e.getModifiersEx()==InputEvent.BUTTON3_DOWN_MASK) {
			
			System.out.println("Has pulsado el boton derecho...");
			
		}else if(e.getModifiersEx()==InputEvent.BUTTON2_DOWN_MASK) {
			
			System.out.println("Has pulsado el baton del medio...");
			
		}
	}
	
}


class MensajeRatonMovimiento implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Arrastraste el mouse");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Moviste el mouse");
	}
	
}




