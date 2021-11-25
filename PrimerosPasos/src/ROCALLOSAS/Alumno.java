package ROCALLOSAS;

public class Alumno {
	
	private String nombre;
	private int nota;
    private int promedio;
    
    public String getNombre(){
    	
        return nombre;
    }
    
    public void setNombre(String nombre){
    	
        this.nombre = nombre;
    }
    
    public int getnota() {
    	
    	return nota;
    }
    
    public void setNota(int nota) {
	
        try{
            
            if(nota > 0 && nota <= 10) {
			
                this.nota = nota;	
            }else {
                throw new IllegalArgumentException("Fuera de rango la nota deberia estar entre 1 y 10");
            }
            
        }catch(IllegalArgumentException e){
            
            System.out.println(e);
            
        }
    }
    public String getPromedio() {
    	
    	if(promedio > 6) {
    		
    		return "Aprobado";
    		
    	}else {
    		
    		return "Desaprobado";
    	}
		
    }
    
    public void setPromedio(int promedio) {
    	
    	this.promedio = promedio;
    	
    }
    
}

