package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;

import javax.swing.JFrame;

public class EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEventosTeclado marco = new MarcoEventosTeclado();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoEventosTeclado extends JFrame {
	
	public MarcoEventosTeclado() {
		
		setVisible(true);
		
		setBounds(300,300,500,350);
		
		addKeyListener(new MensajeTeclado());
	}
}

class MensajeTeclado implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// El e.getKeyCode() no funcion en este metodo.
		System.out.println("La letra presionada fue " + e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La tecla presionada es " + e.getKeyChar() + " y su código es " + e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La tecla soltada es " + e.getKeyChar());
	}

	
	
	
}