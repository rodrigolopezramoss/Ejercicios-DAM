public class Ejercicio22{
  public static void main(String [] args){

    String linea;

    System.out.println("Números primos del 2 al 100.");
    
    boolean p = true;
    
    for (int i = 2; i <= 100; i++) {
      p = true;
      for (int j = 2; j < i; j++) {
        if ((i % j) == 0) {
          p = false;
        }
      }
      if (p) {
        System.out.println(i);
      }
    }
    System.out.println(100);
  }
}
