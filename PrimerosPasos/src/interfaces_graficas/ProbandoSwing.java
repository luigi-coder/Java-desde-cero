package interfaces_graficas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;

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
		
		
		Toolkit pantalla = Toolkit.getDefaultToolkit(); // Obtengo info de mi pantalla
		
		Dimension tamanioPantalla = pantalla.getScreenSize(); // Obtengo el tamaño de mi pantalla
		
		int height = tamanioPantalla.height; // Obtengo el alto de mi pantalla
		
		int width = tamanioPantalla.width; // Obtengo el ancho de mi pantalla
		
		setBounds(width/4, height/4,width/2,height/2); // Centro el marco
		
		setTitle("Ventana de prueba"); // Agrego titulo a mi marco
		
		Image icono = pantalla.getImage("src/interfaces_graficas/love.jpg"); // agrego icono a mi marco
		
		setIconImage(icono); // Visibilidad a la imagen
		
		Lamina1 lamina1 = new Lamina1();
		
		add(lamina1);
		
	}
	
	
}


class Lamina1 extends JPanel {
	
	
	// Creo el metodo para poder escribir sobre la primera lamina
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g); // llamamos al paintComponente de la clase JPanel para que haga su trabajo
		
		g.drawRect(50,50,200,200);
		
		g.drawString("Escribiendo...", 60,70); // Ademas le decimos que tiene que escribir.
		
		g.drawLine(60, 80, 145, 80);
		
		g.drawArc(50, 100, 100, 200, 120, 150);
		
		Graphics2D g2 = (Graphics2D) g; // Refundicion del parametro Graphics g
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		
		//kfjgdfgjfdngn
	}
}































































