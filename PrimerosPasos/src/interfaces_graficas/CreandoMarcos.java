package interfaces_graficas;

import javax.swing.*;

import java.awt.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		
		miMarco marco = new miMarco();
		
		marco.setVisible(true);
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco extends JFrame {
	
	public miMarco() {
		
		// Cambiando la ubicacion de la ventana 
		// setLocation(500,500);
				
		// 500 y 300 ubicacion
		// 250 y 250 tamaño
		setBounds(500,300,500,250);
				
		// Establece si el marco es redimensionable o no
		// setResizable(false);
				
		// Permite que el marco se abra a pantalla completa
		// Frame.MAXIMIZED_BOTH maximiza horizontal y verticalmente 
		// Frame.MAXIMIZED_BOTH es un numero int
		// setExtendedState(Frame.MAXIMIZED_BOTH);
				
		setTitle("Primera ventana de Luis Salinas");
	}
	
	
}