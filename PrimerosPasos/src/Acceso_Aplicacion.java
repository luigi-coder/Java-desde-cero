import javax.swing.JOptionPane;

public class Acceso_Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Luis";
		
		String password = "";
		
		String mensaje = "";
		
		while(clave.equalsIgnoreCase(password)==false) {
			
			password = JOptionPane.showInputDialog("Ingrese la contraseña: ");
			
			if(clave.equalsIgnoreCase(password)==false) {
				
				mensaje = "contraseña incorrecta";
			}
		}
		
		mensaje = "Acceso permitido";
		
		System.out.println(mensaje);
	}

}
