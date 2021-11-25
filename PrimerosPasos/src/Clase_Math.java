
public class Clase_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Metodo sqrt
		int nueve = 9;
		double raiz = Math.sqrt(nueve);
		System.out.println("La raiz cuadrada de " + nueve + 
						   " es: " + Math.round(raiz));
		// Metodo round
		double num1 = 5.85;
		/* aplicando refundicion convertir el 
		resultado de Math.round(num1)*/
		int resultado = (int) Math.round(num1);
		System.out.println(num1 + " usando el metodo Math.round: " + resultado);
		
		// Metodo pow
		double base = 5;
		double exponente = 3;
		
		int resultado2 = (int)Math.pow(base, exponente);
		System.out.println(Math.round(base) + " elevado a la " + Math.round(exponente) + 
						   " es " + resultado2);
		
	}

}
 