package ejercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class QuitaComentarios {
  public static void main (String[]args) {
	
	try {
	  BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
	  BufferedWriter bw1 = new BufferedWriter(new FileWriter(args[1]));
	  
	  String linea;
	  
	  do {
		linea = br1.readLine();
		if(linea != null) {
		  if(linea.contains("/")) {
			  System.out.print(" ");
		  }else {
		  bw1.write(linea + "\n");
		  }
		}
	  } while(linea != null);

	  br1.close();
	  bw1.close();
	} catch(FileNotFoundException f){
	  System.out.println("No se puede encontrar alguno de los ficheros");
		
	} catch (IOException ioe) {
  System.out.println("Existen problemas de lectura y/o escritura en algún fichero");
	}
  }
}
