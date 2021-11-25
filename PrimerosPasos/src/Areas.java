import java.util.Scanner;
import javax.swing.JOptionPane;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Elije una opcion: \n" + 
						   "1. Cuadrado \n" + 
						   "2. Rectangulo \n" + 
						   "3. Triangulo \n" + 
						   "4. Circulo");
		
		int figura = entrada.nextInt();
		
		switch(figura) {
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			int aCuadrado = (int) Math.pow(lado,2);
			
			System.out.println("El area del cuadrado es: " + aCuadrado);
		break;
		case 2: 
			int baseC = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int alturaC = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			int aRectangulo = (baseC*alturaC);
			
			System.out.println("El area del rectangulo es: " + aRectangulo);
		break;
		case 3: 
			int baseT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int alturaT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			int aTriangulo = (baseT*alturaT)/2;
			
			System.out.println("El area del triangulo es: " + aTriangulo);
		break;
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			double aCirculo = Math.pow(Math.PI*radio,2);
			
			System.out.print("El area del circulo es: ");
			System.out.printf("%1.2f", aCirculo);
		break;
		default:
			System.out.println("El valor ingresado es invalido");
		
		}
	}

}
