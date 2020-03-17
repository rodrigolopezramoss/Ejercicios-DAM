package ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej02 {
  public static void main(String[] args) {
		
	try {
	  BufferedReader br = new BufferedReader(new FileReader("primos.txt"));
	  String linea;
		do {
		  linea = br.readLine();
		  if(linea != null) {
			System.out.println(linea + "\n");
		  }
		}while (linea != null);
	  br.close();
	  
	} 
	catch (FileNotFoundException fnfe) { 
	  System.out.println("No se encuentra el fichero primos.txt");
	
	} 
	catch (IOException ioe) { 
	  System.out.println("Se ha producido un error de lectura/escritura sobre el fichero primos.txt");
	
	}
  }
}