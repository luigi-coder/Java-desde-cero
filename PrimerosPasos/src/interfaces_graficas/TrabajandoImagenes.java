package interfaces_graficas;

import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class TrabajandoImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagen marco = new MarcoImagen();
		
		marco.setVisible(true);
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagen extends JFrame {
	
	public MarcoImagen() {
		
		setTitle("Marco con imagen");
		
		setBounds(750,300,300,200);
		
		LaminaConImagen lamina = new LaminaConImagen();
		
		add(lamina);
		
		
	}
}

class LaminaConImagen extends JPanel {
	
	private Image imagen;
	
	public LaminaConImagen() {
		
		// File miImagen = new File("src/interfaces_graficas/love.jpg");
		
		// Para ejecutar la linea 54 debemos de programar 
		// una excepsion
		try {
					
			imagen = ImageIO.read(new File("src/interfaces_graficas/love.jpg"));
					
		} catch (IOException e) {
					
					
			System.out.println("La imagen no se encuentra");
		}
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
		
		
		
		int anchuraImagen = imagen.getWidth(this); // this es la lamina
		int alturaImagen = imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		for (int i=0; i < 300; i++) {
			
			for (int j = 0; j < 200; j++) {
				
				if(i+j > 0) {
					
					g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
				}
			}
			
		}
		
		
	}
	
}













