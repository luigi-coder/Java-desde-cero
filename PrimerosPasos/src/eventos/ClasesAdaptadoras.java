package eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class ClasesAdaptadoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana2 mimarco = new MarcoVentana2();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana2 mimarco2 = new MarcoVentana2();
		
		mimarco2.setVisible(true);
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		mimarco.setTitle("Ventana 1");
		mimarco2.setTitle("Ventana 2");
		
		mimarco.setBounds(300, 300, 500, 350);
		mimarco2.setBounds(900, 300, 500, 350);
		

	}

}


class MarcoVentana2 extends JFrame {
	
	public MarcoVentana2() {
		
		// setTitle("Eventos de ventana");
		
		// setBounds(700,300,500,300);
		
		/* M_Ventana2 oyente = new M_Ventana2();
		
		addWindowListener(oyente);*/
		
		addWindowListener(new M_Ventana2());
		
	}
}


// Clase oyente adaptadora, M_Ventana2 hereda de
// WindowAdapter, conviertiendose en una clase
// adaptadora donde puedo solo sobreescribir el
// metodo que voy a utilizar.
class M_Ventana2 extends WindowAdapter {

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana minima");
		
	}
	
}
