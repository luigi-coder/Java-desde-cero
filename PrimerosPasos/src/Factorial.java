import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado = 1; // Ojo con el alcance de tipo entero 
		// Long resultado = 1L
		// BigInteger almacena numero grandes
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		for(int i=numero; i>0; i--) {
			
			resultado = resultado*i;
		}
		
		JOptionPane.showMessageDialog(null, "El factorial de " + numero + 
										    " es " + resultado);
	}

}
