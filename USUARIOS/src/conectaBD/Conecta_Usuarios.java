package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conecta_Usuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			// 1. Crear conexion
			Connection miConexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/teclab_schema", "root", "123456789");
			
			// 2. Crear Objeto Statement
			Statement miStatement = miConexion.createStatement();
			
			// 3. Ejecutar la instruccion sql
			ResultSet miResultSet = miStatement.executeQuery("Select * from usuarios");
			
			// 4. Recorrer el resultSet
			while(miResultSet.next()) {
				System.out.println(
						miResultSet.getString("id") + " " +
						miResultSet.getString("nombre") + " " + 
						miResultSet.getString("apellido"));
			}
			
		}catch(Exception e) {
			System.out.println("Ocurrio un error " + e.getMessage());
			e.printStackTrace();
		}
	}

}
