package JAVABASICO;
import javax.swing.JOptionPane;

public class Test_Preguntas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("Cual es tu nombre: ");
		
		JOptionPane.showMessageDialog(null,"Bienvenido al test JavaScript " + nombre +
						   " deseas continuar: ");
		
		String pregunta = "";
		
		int contadorP = 1; // contador preguntas
		
		int contadorC = 0; // contador correctas
		
		int nota_ideal = 3;
		
		do {
			
			if(contadorP==1) {
				
				pregunta = JOptionPane.showInputDialog(
						   "¿ JavaScript es un lenguajes estrictamente tipado ? SI - NO");
				
				if(pregunta.equalsIgnoreCase("NO")) {
						
					JOptionPane.showMessageDialog(null,"respuesta correcta");
					contadorC++;
					
				}else {
					
					JOptionPane.showMessageDialog(null,"respuesta incorrecta");
				}
				
				contadorP++;
			}
			if(contadorP==2) {
				
				pregunta = JOptionPane.showInputDialog(
						   "¿ JavaScript es un lenguajes FrontEnd ? SI - NO");
				
				if(pregunta.equalsIgnoreCase("SI")) {
					
					JOptionPane.showMessageDialog(null,"respuesta correcta");
					contadorC++;
					
				}else {
					
					JOptionPane.showMessageDialog(null,"respuesta incorrecta");
				}
				
				contadorP++;
			}
			if(contadorP==3) {
				
				pregunta = JOptionPane.showInputDialog(
						   "¿ JavaScript es un lenguajes BackEnd ? SI - NO");
				
				if(pregunta.equalsIgnoreCase("NO")) {
					
					JOptionPane.showMessageDialog(null,"respuesta correcta");
					contadorC++;
					
				}else {
					JOptionPane.showMessageDialog(null,"respuesta incorrecta");
				}
				
				contadorP++;
			}
			
			
		}while(pregunta.equalsIgnoreCase("SI")==false &&
			   pregunta.equalsIgnoreCase("NO")==false);
		
		JOptionPane.showMessageDialog(null, nombre + 
									  " gracias por participar del test tu nota es de " + contadorC + 
									  "/" + nota_ideal);
	}

}
