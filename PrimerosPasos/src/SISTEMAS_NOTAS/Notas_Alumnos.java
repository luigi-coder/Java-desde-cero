package SISTEMAS_NOTAS;

public class Notas_Alumnos {
	
	private String nombre;
	private int nota1;
	private int nota2;
	private int nota3;
	
	// Constructor
	public Notas_Alumnos(String nombre, int nota1, int nota2, int nota3) {
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
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
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
}
