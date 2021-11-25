import javax.swing.JOptionPane;

public class Uso_Array_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String [] paises = {
				"Peru",
				"Argentina",
				"Colombia",
				"España"
				};
		
		// forEach
		for(String pais:paises) {
			System.out.println(pais);
		}
		*/
		
		int longitud = Integer.parseInt(JOptionPane.showInputDialog(
				"Ingrese la longitud del array: "));
		
		String [] paises = new String[longitud];
		
		for(int i=0; i<paises.length; i++) {
			
			paises[i]= JOptionPane.showInputDialog("Introduce pais: ");
		}
		
		for(String pais:paises) {
			System.out.println(pais);
		}
		
	}

}
