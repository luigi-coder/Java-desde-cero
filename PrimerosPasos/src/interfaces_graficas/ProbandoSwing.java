package interfaces_graficas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import javax.swing.*;

public class ProbandoSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco marco1 = new Marco(); // Instancio la clase Marco
		
		marco1.setVisible(true); // Le doy visibilidad a mi marco
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Le digo que que al momento de cerrar mi marco, el programa termine
	}

}




class Marco extends JFrame {
	
	public Marco() {
		
		setTitle("Probando colores"); // Agrego titulo a mi marco
		
		setSize(400,400);
		Lamina1 lamina1 = new Lamina1();
		
		add(lamina1);
		
		lamina1.setBackground(Color.blue);
		
	}
	
	
}


class Lamina1 extends JPanel {
	

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g); 
		
		
		Graphics2D g2 = (Graphics2D) g; 
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		
		g2.setPaint(Color.red);
		
		g2.fill(rectangulo);
		
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		g2.setPaint(Color.blue);
		
		elipse.setFrame(rectangulo);
		
		g2.fill(elipse);
		
	}
}


























































