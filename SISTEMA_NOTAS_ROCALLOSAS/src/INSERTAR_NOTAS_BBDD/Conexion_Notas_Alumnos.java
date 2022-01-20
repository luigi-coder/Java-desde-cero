package INSERTAR_NOTAS_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Conexion_Notas_Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			Notas_Alumnos alumno = new Notas_Alumnos();
			
			String url = "jdbc:mysql://localhost:3306/Notas_Alumnos";
			String usuario = "root";
			String password = "123456789";
			
			// 1. Creando la conexion a BBDD
			Connection miConexion = DriverManager.getConnection(url,usuario,password);
			
			// 2. Creando Objeto Statement
			Statement miStatement = miConexion.createStatement();
			
			// 3. Creando Array de nombre y notas
			Notas_Alumnos [] nombreNotas = new Notas_Alumnos[10];
			
			for(int i=0; i<10; i++) {
				
				
				nombreNotas[i] = new Notas_Alumnos();
				nombreNotas[i].setNombre(JOptionPane.showInputDialog("Ingresa nombre del alumno: "));
				nombreNotas[i].setNota1(Integer.parseInt(JOptionPane.showInputDialog("Nota 01: ")));
				nombreNotas[i].setNota2(Integer.parseInt(JOptionPane.showInputDialog("Nota 02: ")));
				nombreNotas[i].setNota3(Integer.parseInt(JOptionPane.showInputDialog("Nota 03: ")));
				
			}
			
			for(int i=0; i<10; i++) {
				
				
				String intruccionSQL = "INSERT INTO Notas_Alumnos(nombre,nota1,nota2,nota3) values('" + 
						nombreNotas[i].getNombre() + "', '" + 
						nombreNotas[i].getNota1() + "', '" + 
						nombreNotas[i].getNota2() + "' , '" + 
						nombreNotas[i].getNota3() + "')"; 
				
				miStatement.executeUpdate(intruccionSQL);
			}
			
			System.out.println("Datos insertados correctamente");
			
		} catch (SQLException e) {
			
			System.out.println("Error en la insercion " + e.getMessage());
			e.printStackTrace();
		}
	}

}
