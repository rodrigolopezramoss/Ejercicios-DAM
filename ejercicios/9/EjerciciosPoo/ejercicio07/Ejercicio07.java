package ejercicio07;

import java.util.Scanner;


public class Ejercicio07 {
  public static void main (String[]args) {
	Scanner s = new Scanner (System.in);
	
	Zona principal = new Zona(1000);
	Zona comercial = new Zona(200);
	Zona vip = new Zona(25);
	
	
	System.out.println("1. Mostrar número de entradas libres");
	System.out.println("2. Vender entradas");
	System.out.println("3. Salir");
	
	int opcion = 0;
	
	while(opcion != 3) {
		opcion = Integer.parseInt(s.nextLine());
		
		switch(opcion) {
		  case 1:
			System.out.println("Quedan " + principal.getEntradasPorVender() + " entradas de la zona principal.");
			System.out.println("Quedan " + comercial.getEntradasPorVender() + " entradas de la zona de compra-venta.");
			System.out.println("Quedan " + vip.getEntradasPorVender() + " entradas de la zona vip.");
			
			break;
		  case 2:
			System.out.println("¿Qué zona querría?");
			System.out.println("Zona 1\r\n" + "Zona 2\r\n" + "Zona 3\r\n");
			
			int opcion2;
			opcion2 = Integer.parseInt(s.nextLine());
			
			switch(opcion2) {
			  case 1:
				System.out.println("¿Cuántas entradas serían?");
				int opci1;
				opci1 = Integer.parseInt(s.nextLine());
				
				principal.vender(opci1);
				break;
			  case 2:
				System.out.println("¿Cuántas entradas serían?");
				int opci2;
				opci2 = Integer.parseInt(s.nextLine());
				
				comercial.vender(opci2);
				break;
			  case 3:
				System.out.println("¿Cuántas entradas serían?");
				int opci3;
				opci3 = Integer.parseInt(s.nextLine());
				
				vip.vender(opci3);
				break;
			}
			break;
		  case 3:
			  System.out.println("Que pase un buen día.");
			break;
		}
	}
  }
}
