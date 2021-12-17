package CLASE_ENUM;

import java.util.Scanner;

public class Uso_Tallas {
	
	// Tipo enumerado hacerlo fuera del main o en otra clase
	
	// enum Talla {mini,mediano,grande,muy_grande};
	
	// Otra manera de usar enum con constructor 
	
	enum Talla {
		
		// Valores aceptados
		
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
		
		// Private - pq la clase enum no admite la creacion 
		// de objetos
		
		private Talla(String abreviatura) {
			
			this.abreviatura = abreviatura;
		}
		
		private String abreviatura;
		
		public String dameTalla() {
			
			return abreviatura;
					
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* TIPOS ENUMERADOS - es una variable
		objeto de tipo enum en la cual podemos
		almacenar un grupo de valores y solo se
		podra almacenar ese grupo de valores */
		
		// Talla s  = Talla.mini;
		// Talla m  = Talla.mediano;
		// Talla l  = Talla.grande;
		// Talla xl = Talla.muy_grande;
		
		// Otra manera 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el talle: MINI,MEDIANO,GRANDE y MUY_GRANDE");
		
		String entrada_datos = entrada.next().toUpperCase();
		
		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("LA TALLA: " + la_talla);
		System.out.println("ABREVIATURA: " + la_talla.dameTalla());
	}

}







