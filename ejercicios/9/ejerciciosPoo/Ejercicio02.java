package ejerciciosPoo;

import java.util.Scanner;


public class Ejercicio02 {
  public static void main(String[]args) {
	Scanner s = new Scanner (System.in);
	
	Coche c01 = new Coche();
	Bicicleta b01 = new Bicicleta();
	
	System.out.println("VEHÍCULOS\r\n" + 
				"=========\r\n" + 
				"1. Anda con la bicicleta\r\n" + 
				"2. Haz el caballito con la bicicleta\r\n" + 
				"3. Anda con el coche\r\n" + 
				"4. Quema rueda con el coche\r\n" + 
				"5. Ver kilometraje de la bicicleta\r\n" + 
				"6. Ver kilometraje del coche\r\n" + 
				"7. Ver kilometraje total\r\n" + 
				"8. Salir\r\n" + 
				"Elige una opción (1-8):");
	
	int opcion = 0;
	
	
	
	
	
	while(opcion != 8) {
		opcion = Integer.parseInt(s.nextLine());
		
		switch(opcion) {
		  case 1:
			b01.anda(((int)(Math.random()*45)+1));
			System.out.println("Ha andado " + b01.getkilometrosRecorridos() + " kilometros.");
			break;
		  case 2:
			b01.caballea();
			break;
		  case 3:
			c01.anda((int)(Math.random()*125)+1);
			System.out.println("Ha andado " + c01.getkilometrosRecorridos() + " kilometros.");
			break;
		  case 4:
			c01.quemaRuedas();
			break;
		  case 5:
			System.out.println("Ha andado " + b01.getkilometrosRecorridos() + " kilometros en total.");
			break;	
		  case 6:
			System.out.println("Ha andado " + c01.getkilometrosRecorridos() + " kilometros en total.");
			break;
		  case 7:
			System.out.println("Han sido andados " + Vehiculo.getkilometrosTotales() + " kilometros entre ambos vehículos.");
			break;
		  case 8:
			break;
		}
	}
	c01.marca();
	
	b01.marca();
  }
}
