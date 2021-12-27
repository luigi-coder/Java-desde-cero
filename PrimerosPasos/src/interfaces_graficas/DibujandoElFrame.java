package interfaces_graficas;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.security.DrbgParameters;

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
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100,100,300,250));
		
		double CentroenX = rectangulo.getCenterX();
		
		double CentroenY = rectangulo.getCenterY();
		
		double radio = 150;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
		
		g2.draw(circulo);
		
	}
}

/*
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
 */








