
public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix = {
				
				{10,15,18,19,21},
				{11,16,19,20,22},
				{12,17,20,21,23},
				{13,18,21,22,24}
		};
		
		
		for(int i=0; i < matrix.length; i++) {
			
			System.out.println();
			
			for(int j=0; j< matrix[i].length; j++) {
				
				System.out.print(matrix[i][j] + " ");
			}
		}
		
		System.out.println();
		
		for(int[] fila:matrix) {
			System.out.println();
			for(int colum:fila) {
				System.out.print(colum + " ");
			}
		}
		
		/*
		// Matriz de 2 dimensiones
		int[][] matriz_bidimensional = new int[4][5];
		
		matriz_bidimensional [0][0] = 15;
		matriz_bidimensional [0][1] = 21;
		matriz_bidimensional [0][2] = 18;
		matriz_bidimensional [0][3] = 9;
		matriz_bidimensional [0][4] = 15;
		
		matriz_bidimensional [1][0] = 10;
		matriz_bidimensional [1][1] = 52;
		matriz_bidimensional [1][2] = 17;
		matriz_bidimensional [1][3] = 19;
		matriz_bidimensional [1][4] = 7;
				
		matriz_bidimensional [2][0] = 19;
		matriz_bidimensional [2][1] = 2;
		matriz_bidimensional [2][2] = 19;
		matriz_bidimensional [2][3] = 17;
		matriz_bidimensional [2][4] = 7;
				
		matriz_bidimensional [3][0] = 92;
		matriz_bidimensional [3][1] = 13;
		matriz_bidimensional [3][2] = 13;
		matriz_bidimensional [3][3] = 32;
		matriz_bidimensional [3][4] = 41;
		
		
		for(int i=0; i < 4; i++) {
			
			System.out.println();
			
			for(int j=0; j< 5; j++) {
				
				System.out.print(matriz_bidimensional[i][j] + " ");
			}
		}*/
	}
	

}
