
public class Menu_Semanal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] menu = {
				
				{"         ", 
				 "Desayuno",
				 "      Almuerzo",
				 "       Merienda",
				 "      Cena"},
				
				{"LUNES    ",
				 "Zumo de frutas",
				 "Salmon en pasta", 
				 "Donuts caseros",
				 "Espirales de queso"},
				
				{"MARTES   ",
				 "Zumo de frutas",
				 "Salmon en pasta", 
				 "Donuts caseros",
				 "Espirales de queso"},
				
				{"MIERCOLES",
					 "Zumo de frutas",
					 "Salmon en pasta", 
					 "Donuts caseros",
					 "Espirales de queso"},
				{"JUEVES   ",
						 "Zumo de frutas",
						 "Salmon en pasta", 
						 "Donuts caseros",
						 "Espirales de queso"},
				{"VIERNES  ",
							 "Zumo de frutas",
							 "Salmon en pasta", 
							 "Donuts caseros",
							 "Espirales de queso"}
				
		};
		
		for(int i=0; i < menu.length; i++) {
			
			System.out.println();
			
			for(int j=0; j< menu[i].length; j++) {
				
				System.out.print(menu[i][j] + " ");
			}
		}
	}

}
