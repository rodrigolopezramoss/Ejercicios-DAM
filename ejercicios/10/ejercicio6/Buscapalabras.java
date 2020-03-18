package ejercicio6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buscapalabras {
  public static void main (String[]args) {
	/*Este programa funciona a través del terminal
	 *El orden sería: ficherodeejemplo palabradeejemplo
	 */
	try {
	  BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
	  
	  String linea;
	  int contador = 0;
	  
	  do {
		linea = br1.readLine();
		if(linea != null) {
		  if(linea.contains(args[1])) {
		    contador++;
		  }
		}
	  } while(linea != null);
	  br1.close();
	  
	  System.out.println("Existen " + contador + " palabras así dentro de este fichero");
	  
	} catch(FileNotFoundException f){
	  System.out.println("No se puede encontrar alguno de los ficheros");
			
	} catch (IOException ioe) {
	  System.out.println("Existen problemas de lectura y/o escritura en algún fichero");
	}
  }
}
