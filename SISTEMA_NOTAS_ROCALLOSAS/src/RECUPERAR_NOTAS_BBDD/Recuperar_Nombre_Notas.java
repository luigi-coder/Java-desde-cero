package RECUPERAR_NOTAS_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Recuperar_Nombre_Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/Notas_Alumnos";
			String usuario = "root";
			String password = "123456789";
			
			// 1. Creando la conexion a BBDD
			Connection miConexion = DriverManager.getConnection(url,usuario,password);
			
			// 2. Creando Objeto Statement
			Statement miStatement = miConexion.createStatement();
			
			// 3. Ejecutar instruccion SQL
			ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM Notas_Alumnos");
			
			// 4. Recorrer el resultset
			while(miResultSet.next()) {
				
				int promedio = miResultSet.getInt("nota1") + 
							   miResultSet.getInt("nota2") + 
							   miResultSet.getInt("nota3");
				
				if( promedio <= 7) {
					
					System.out.println(miResultSet.getString("nombre") + " Desaprobado");
				}else {
					
					System.out.println(miResultSet.getString("nombre") + " Aprobado");
				}
				
				System.out.println(miResultSet.getString("Nombre") + " " + promedio);
			}
			
		}catch(Exception e) {
			
			System.out.println("Error al recuperar los datos de la BBDD" + e.getMessage());
			e.printStackTrace();
		}
	}

}
