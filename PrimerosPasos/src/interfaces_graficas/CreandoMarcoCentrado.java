package interfaces_graficas;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Image;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado marco = new MarcoCentrado();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
	}

}

class MarcoCentrado extends JFrame {
	
	public MarcoCentrado() {
		
		// Devuelve en donde estas ejecutando el prpograma 
		// ya sea una ventana o otro dispositivo
		Toolkit pantalla = Toolkit.getDefaultToolkit(); // devuelve un objeto de tipo Toolkit
		
		// almacenamos la resolucion de mi pantalla
		Dimension tamanioPantalla = pantalla.getScreenSize();
		
		// Extraer el alto y ancho
		int alturaPantalla = tamanioPantalla.height;
		int anchoPantalla = tamanioPantalla.width;
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("Titulo de Luis Salinas - Marco centrado");
		
		Image miIcono = pantalla.getImage("src/interfaces_graficas/love.png");
		
		setIconImage(miIcono);
	}
}