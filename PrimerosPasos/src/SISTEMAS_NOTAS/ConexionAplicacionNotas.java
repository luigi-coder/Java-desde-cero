package SISTEMAS_NOTAS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionAplicacionNotas {

	public static void main(String[] args) {
		
		try {
			
			// 1. Crear conexion
			Connection miConexion = DriverManager.getConnection(
								"jdbc:mysql://localhost:3306/Notas_Alumnos", "root", "123456789");
						
			// 2. Crear Objeto Statement
			Statement miStatement = miConexion.createStatement();
			
			Notas_Alumnos [] notas = new Notas_Alumnos [3];
			
			int [] promedio = new int [3];
			
			
			for(int i=0; i<notas.length;i++) {
				
				notas[i] = new Notas_Alumnos(
						JOptionPane.showInputDialog("Nombre del alumno " + i + ": " ),
						Integer.parseInt(JOptionPane.showInputDialog("Ingresa nota" + i + ": ")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingresa nota" + i + ": ")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingresa nota" + i + ": "))
						);
			}
			
			for(int i=0; i<notas.length; i++) {
				
				String instruccionSQL = "INSERT INTO Notas_Alumnos(nombre,nota1,nota2,nota3) values('" + 
										notas[i].getNombre() + "', '" + 
										notas[i].getNota1() + "', '" + 
										notas[i].getNota2() + "' , '" + 
										notas[i].getNota3() + "')";   
				
				miStatement.executeUpdate(instruccionSQL);
				
			}
			
			System.out.println("Datos insertados correctamente");
			
			/*
			for(int i=0; i<notas.length; i++) {
				
				promedio[i] = (notas[i].getNota1()+ notas[i].getNota2()+ notas[i].getNota3())/notas.length;	
				
			}
			*/
			/*
			for(int i=0; i<notas.length; i++) {
				
				System.out.println( notas[i].getNombre() + " " + 
							        notas[i].getNota1() + " " + 
						            notas[i].getNota2() + " " + 
							        notas[i].getNota3() + ". Promedio: " + 
						            promedio[i]);
			}
			*/
		}catch(Exception e) {
			
			System.out.println("Error en la insercion " + e.getMessage());
			
			e.printStackTrace();
		}
	}

}
