package INSERTAR_NOTAS_BBDD;

public class Notas_Alumnos {
	
		// Variables
		private String nombre;
		private int nota1;
		private int nota2;
		private int nota3;
		
		// constructor 
		public Notas_Alumnos(String nombre, int nota1, int nota2, int nota3) {
			
			this.nombre = nombre;
			this.nota1 = nota1;
			this.nota2 = nota2;
			this.nota3 = nota3;
			
		}
		public Notas_Alumnos() {
			
			
		}
		

		public String getNombre() {
			
			return nombre;
		}
		
		public void setNombre(String nombre) {
			
			this.nombre = nombre;
		}
		
		public int getNota1() {
			
			return nota1;
		}
		
		public void setNota1(int nota) {
			
			boolean resultado = evaluarNotas(nota);
			
			if(resultado) this.nota1 = nota;
		}
		
		public int getNota2() {
			
			return nota2;
		}
		
		public void setNota2(int nota) {
			
			boolean resultado = evaluarNotas(nota);
			
			if(resultado) this.nota2 = nota;
		}
		
		public int getNota3() {
			
			return nota3;
		}
		public void setNota3(int nota) {
			
			boolean resultado = evaluarNotas(nota);
			
			if(resultado) this.nota3 = nota;
		}
		public boolean evaluarNotas(int nota) {
			
			try {
				
				if(nota < 1 || nota > 10) {
					throw new Exception("La nota es invalida");
				}else {
					return true;
				}
			}catch(Exception e) {
				System.out.println(e);
				return false;
			}
		}
		
}











