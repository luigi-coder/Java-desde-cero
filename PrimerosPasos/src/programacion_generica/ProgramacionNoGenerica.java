package programacion_generica;



public class ProgramacionNoGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList archivos = new ArrayList(4);
		
		archivos.add("Juan");
		archivos.add("Luis");
		archivos.add("Nayely");
		/* Esto marca error pq file no se puede convetir
		 * a string  por eso es imporante la programacion
		 * generica. */
		// archivos.add(new File("gestion_Pedidos.accdb"));
		
		String nombrePersona = (String)archivos.get(4);
		
	}

}

class ArrayList{
	
	private Object[] datosElemento;
	
	private int i=0;
	
	public ArrayList(int z) {
		
		datosElemento = new Object[z];
				
	}
	
	public Object get(int i) {
		
		return datosElemento[i];
		
	}
	
	public void add(Object o) {
		
		datosElemento[i] = o;
		
		i++;
	}
}