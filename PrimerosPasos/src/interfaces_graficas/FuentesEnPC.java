package interfaces_graficas;

import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class FuentesEnPC {

	public static void main(String[] args) {
		
		
		String fuente = JOptionPane.showInputDialog("Introduce la fuente: ");
		
		boolean estalafuente = false;
		
		// almacena los tipos de letra de la pc del usuario en un array
		
		String [] tiposFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for (String tipoFuente : tiposFuentes) {
			
			System.out.println(tipoFuente);
			
			if(tipoFuente.equals(fuente)) {
				
				estalafuente=true;
			}
		}
		
		if(estalafuente) {
			
			System.out.println("Fuente instalada");
		}else {
			System.out.println("Fuente no instalada");
		}
		
	}

}
