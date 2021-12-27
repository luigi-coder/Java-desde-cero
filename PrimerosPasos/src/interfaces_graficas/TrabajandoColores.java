package interfaces_graficas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConColor marco = new MarcoConColor();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
	}

}

class MarcoConColor extends JFrame {
	
	public MarcoConColor() {
		
		setTitle("Coloreando...");
		
		setSize(400,400);
		
		LaminaConColor lamina = new LaminaConColor();
		
		add(lamina);
		
		// lamina.setBackground(Color.green);
		
		// Fondo del color de SOperativo
		lamina.setBackground(SystemColor.window);
		
	}
}

class LaminaConColor extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		
		g2.setColor(Color.BLUE);
		g2.draw(rectangulo);
		// Color del trazo
		g2.setPaint(Color.RED);
		
		// Pinta en rectangulo
		g2.fill(rectangulo);
		//g2.draw(rectangulo);
		
		// Creando un color por las ...
		Color color = new Color(177,89,230);
		
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.setPaint(color);
		// .brighter agrega brillo
		// .darker agrega oscuridad
		
		// Con este lo relleno
		g2.fill(elipse);
		
		// Con este solo el trazo
		//g2.draw(elipse);
		
		
	}
	
}































