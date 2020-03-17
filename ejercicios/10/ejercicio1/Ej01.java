package ejercicio1;

import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ej01 {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.txt"));
      for (int i = 1; i < 501; i++) {
        if (esPrimo(i)) {
          bw.write(String.valueOf(i) + "\n");
        }
      }
      bw.close();
    } catch(FileNotFoundException f){
  	  System.out.println("No se encuentra el fichero primos.txt");
		
  	}catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero");
    }
  }
  
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }
}
