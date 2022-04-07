package interfaces_graficas;

import javax.swing.*;

public class ProbandoSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco marco1 = new Marco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Marco extends JFrame {
	
	public Marco() {
		
		setSize(300,500);
	}
}