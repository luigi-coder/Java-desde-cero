import javax.swing.JOptionPane;

public class Validacion_Mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba = 0;
		boolean arroba2 = false;
		
		boolean punto = false;
		
		String mail = "";
		
		do {
			mail = JOptionPane.showInputDialog("Ingrese su email nombre@mail.com");
			
			for(int i=0; i<mail.length(); i++) {
				
				if(mail.charAt(i)=='@') {
					
					arroba2 = true;
					arroba++;
				}
				if(mail.charAt(i)=='.') {
					
					punto = true;
					System.out.println(punto);
				}
			}
		}while(mail.contains("@")==false);
		
		
		if(arroba==1 && punto==true) {
			
			JOptionPane.showMessageDialog(null, "El email es correcto");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "El email es incorrecto");
		}
	}

}
