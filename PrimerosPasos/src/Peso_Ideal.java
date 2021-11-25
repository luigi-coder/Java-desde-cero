import javax.swing.JOptionPane;

public class Peso_Ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero = "";
		
		// El do-while repetira infinitas veces mientras genero
		// no sea ni H ni M
		do {
			
			genero = JOptionPane.showInputDialog(
					"Introduce tu genero (H - M)");
		}while(genero.equalsIgnoreCase("H")==false && 
			   genero.equalsIgnoreCase("M")==false);
		
		String pregunta = JOptionPane.showInputDialog("Introduce tu altura en cm:");
		
		int altura = Integer.parseInt(pregunta);
		
		int pesoIdeal = 0;
		
		if(genero.equalsIgnoreCase("H")) {
			
			pesoIdeal = altura - 110;
			
		}else if(genero.equalsIgnoreCase("M")) {
			
			pesoIdeal = altura - 120;
		}
		
		JOptionPane.showMessageDialog(null,"Tu peso ideal es: " + pesoIdeal);
		
		
	}

}
