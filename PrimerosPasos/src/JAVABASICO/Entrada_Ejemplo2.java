package JAVABASICO;
import javax.swing.JOptionPane;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Entrada JOptionPane
		String nombre_usuario = JOptionPane.showInputDialog("Ingresa tu nombre de usuario");
		String edad = JOptionPane.showInputDialog("Ingresa tu edad");
		int edadInt = Integer.parseInt(edad); 
		edadInt++;
		System.out.println("Nombre usuario: " + nombre_usuario + "\n" +
						   "Edad usuario: " + edadInt);
		// Formateo de numero
		double x = 10000.0;
		// printf recibe 2 parametros uno el formato a aplicar y el otro valor numerico
		System.out.printf("%1.2f",x/3);
		System.out.println(" ");
		String num1 = JOptionPane.showInputDialog("Introduce un numero: ");
		double num2 = Double.parseDouble(num1);
		double raiz = Math.sqrt(num2);
		
		System.out.print("La raiz de " + num2 + " es: ");
		System.out.printf("%1.2f", raiz);
		
	}

}
