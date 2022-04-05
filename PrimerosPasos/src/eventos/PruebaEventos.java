package eventos;

import java.awt.Color;
import java.awt.Component;
import java.util.jar.JarEntry;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {
	
	public static void main(String[] args) {
		
		MarcoBotones mimarco = new MarcoBotones();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoBotones extends JFrame {
	
	public MarcoBotones() {
		
		setTitle("Botones y Eventos");
		
		setBounds(700,300,500,300);
		
		LaminaBotones milamina = new LaminaBotones();
		
		add(milamina);
		
	}
}

class LaminaBotones extends JPanel implements ActionListener{
	
	// Creando un boton 
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	// Agreganfo un boton a mi frame 
	public LaminaBotones() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		// El parametro de addActionListener es el this
		// porque hace referencia a la clase 
		
		// No olvidar que la clase debe implementar la 
		// interfaces ActionListener
		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// getSource es un evento perteneciente 
		// al objeto ActionEvent, y nos dice quien 
		// fue el que desencadeno el evento.
		Object botonPulsado = e.getSource();
		
		if(botonPulsado==botonAzul) {
			
			setBackground(Color.BLUE);
			
		}else if(botonPulsado == botonAmarillo) {
			
			setBackground(Color.YELLOW);
			
		}else {
			
			setBackground(Color.RED);
		}
		
	}
	
}















