package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ModificaBBDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String [] nombres = new String[1];
			String [] apellidos = new String[1];
			
			nombres[0] = JOptionPane.showInputDialog("Nombre 01: ");
			apellidos[0] = JOptionPane.showInputDialog("Apellido 01: ");
			
			// 1. Crear conexion
			Connection miConexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/teclab_schema", "root", "123456789");
			
			// 2. Crear Objeto Statement
			Statement miStatement = miConexion.createStatement();
			
			// 3. Insertar registros 
			String instruccionSQL = "INSERT INTO USUARIOS(nombre,apellido) values('" + nombres[0] + "', '" + apellidos[0] + "')";     
			
			miStatement.executeUpdate(instruccionSQL);
			
			System.out.println("Datos insertados correctamente");
			
			
		}catch(Exception e) {
			System.out.println("Ocurrio un error " + e.getMessage());
			e.printStackTrace();
		}
	}

}
