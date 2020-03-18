package ejercicio4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ej04 {
  public static void main (String[]args) {
	
	ArrayList<String> palabritas = new ArrayList<>();
	
	try {
	  BufferedReader br1 = new BufferedReader(new FileReader("palabras.txt"));
	  BufferedWriter bw1 = new BufferedWriter(new FileWriter("palabras_sort.txt"));
	  
	  String linea;
	  int contador = 0;
	  
	  do {
		linea = br1.readLine();
		if(linea != null) {
		  palabritas.add(linea);
		  contador++;
		}
	  } while(linea != null);
	  
	  Collections.sort(palabritas);
	  
	  for (int i = 0; i < contador; i++) {
		bw1.write(palabritas.get(i) + "\n");
	  }
	  
	  br1.close();
	  bw1.close();
	} catch(FileNotFoundException f){
	  System.out.println("No se puede encontrar alguno de los ficheros");
		
	} catch (IOException ioe) {
	  System.out.println("Existen problemas de lectura y/o escritura en algún fichero");
	}
  }
}
