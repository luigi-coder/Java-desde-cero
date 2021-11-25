package JAVABASICO;
import java.util.Scanner;

public class Evalua_Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad porfavor: ");
		
		int edad = entrada.nextInt();
		String mensaje = "";
		
		if(edad < 18) {
			mensaje = "Eres un adolescentes";
		}else if(edad < 40) {
			mensaje = "Eres adulto";
		}else if(edad < 65) {
			mensaje = "Eres maduro";
		}else {
			mensaje = "Cuidate";
		}
		
		
		System.out.println(mensaje);
	}

}
