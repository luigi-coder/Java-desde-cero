package interfaces_graficas;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		
		miMarco marco = new miMarco();
		
		marco.setVisible(true);
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco extends JFrame {
	
	public miMarco() {
		
		setSize(500,300);
	}
	
	
}