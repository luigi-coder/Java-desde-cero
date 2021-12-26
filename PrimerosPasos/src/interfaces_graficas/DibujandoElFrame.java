package interfaces_graficas;

import java.awt.*;
import javax.swing.*;

public class DibujandoElFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConDibujo marco = new MarcoConDibujo();
		
		marco.setVisible(true);
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConDibujo extends JFrame {
	
	public MarcoConDibujo() {
		// TODO Auto-generated constructor stub
		
		setTitle("Dibujando...");
		setSize(1000,1000);
		setLocation(400,400);
		
		LaminaDeDibujo lamina = new LaminaDeDibujo();
		
		add(lamina);
		
	}
}

class LaminaDeDibujo extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		// Super llamamos al constructor del padre
		super.paintComponent(g);
		
		// String 
		g.drawString("Cuadrado: ", 50, 40);
		// figuras rectangulares
		g.drawRect(50, 50, 200, 200);
		
		g.drawString("Rectangulo", 300, 40);
		g.drawRect(300, 50, 300, 200);
		
		// Lineas
		g.drawLine(50, 50, 300, 250);
		
		g.drawArc(45, 100, 100, 200, 120, 150);
	}
}








