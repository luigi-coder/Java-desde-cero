package interfaces_graficas;

import javax.swing.*;
import java.awt.*;


public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTexto texto = new MarcoConTexto();
		
		texto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConTexto extends JFrame {
	
	public MarcoConTexto() {
		
		setVisible(true);
		
		setSize(600,450);
		
		setLocation(400,200);
		
		setTitle("Escribiendo...");
		
		Lamina lamina = new Lamina();
		
		add(lamina);
	}
}

class Lamina extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		// hace lo que tiene que hacer
		super.paintComponent(g);
		
		String nombre = "Luis";
		String apellido = "Salinas";
		// escribe el texto en la lamina
		g.drawString("Nombre: " + nombre , 100, 100);
		g.drawString("Apellido: " + apellido, 100, 115);
	}
}













