package ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej03 {
  public static void main (String[]args) {
	try {
	  BufferedReader br1 = new BufferedReader(new FileReader("Ejemplo01.txt"));
	  BufferedReader br2 = new BufferedReader(new FileReader("Ejemplo04v_2.txt"));
	  String linea;
	  String linea2;
	  
      BufferedWriter bw1 = new BufferedWriter(new FileWriter("mezcla.txt"));
	  
	  do {
	    linea = br1.readLine();
	    linea2 = br2.readLine();
	    if((linea != null)|(linea2 != null)) {
		  System.out.println(linea);
		  System.out.println(linea2);
		  bw1.write(linea + "\n" + linea2 + "\n");
		}
	  }while ((linea != null)&(linea2 != null));
	  br1.close();
	  br2.close();
	  bw1.close();
	  	  
	} catch(FileNotFoundException f){
	  System.out.println("No se puede encontrar alguno de los ficheros");
		
	} catch (IOException ioe) {
	  System.out.println("Existen problemas de lectura y/o escritura en algún fichero");
	}
  }
}
