package JAVABASICO;

public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] matriz = new int[4];
		
		matriz[0] = 1;
		matriz[1] = 2;
		matriz[2] = 3;
		matriz[3] = 4;
		
		for(int i=0; i<matriz.length; i++) {
			System.out.println(matriz[i]);
		}
		
		// Declaracion implicita de una array 
		String [] nombres = {"Luis","Maria","Andy","Emma","Nay"};
		
		for(int i=0; i<nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		
	}

}
