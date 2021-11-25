
public class Ejemplo_Excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulado;
		double interes = 0.10; // 10%
		
		double [][] saldo = new double[6][5];
		
		for(int i=0; i<saldo.length;i++) {
			
			saldo[i][0] = 10000;
			acumulado = 10000;
			
			for(int j=1; j<saldo[i].length; j++) {
				
				acumulado = acumulado+(acumulado*interes);
				
				saldo[i][j] = acumulado;
			}
			
			interes = interes+0.01;
			
		}
		
		int porcentaje = 10;
		
		for(double[] fila:saldo) {
			
			System.out.println();
			System.out.print(porcentaje + "% ");
			porcentaje++;

			for(double colum:fila) {
				System.out.printf("%1.2f",colum);
				System.out.print(" ");
			}
		}
		
		
		
	}

}
