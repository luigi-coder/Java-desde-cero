package interfaces_graficas;

import java.awt.*;

import javax.swing.*;

public class TrabajandoFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConFuente marco = new MarcoConFuente();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
	}

}


class MarcoConFuente extends JFrame {
	
	public MarcoConFuente() {
		
		setTitle("Coloreando...");
		
		setSize(1000,400);
		
		LaminaConFuente lamina = new LaminaConFuente();
		
		add(lamina);
		
		// lamina.setBackground(Color.green);
		
		// Fondo del color de SOperativo
		lamina.setBackground(SystemColor.window);
		
		// Color a toda la lamina
		lamina.setForeground(Color.BLUE);
		
	}
}

class LaminaConFuente extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Font fuente = new Font("Zapfino", Font.BOLD, 50);
		
		g2.setFont(fuente);
		
		//g2.setColor(Color.BLACK);
		
		g2.drawString("Programacion en JAVA", 100, 100);
		
		
		g2.setFont(new Font("Zapfino", Font.BOLD, 30));
		
		//g2.setColor(Color.DARK_GRAY);
		
		g2.drawString("Rapido, seguro y fiable", 270, 170);
		
		
		
		
	}
	
}