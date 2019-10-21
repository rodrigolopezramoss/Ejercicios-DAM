public class Ejercicio16{
  public static void main(String[] args){
    
    String linea;
    System.out.println("¿Es tu número primo?.");
    
    System.out.println("Dame un número.");
    linea = System.console().readLine();
    double x;
    x = Double.parseDouble( linea );
    
    boolean p = true;

    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        p = false;
      }
    }
    if (p) {
    System.out.println("Tu número es primo.");
    } else {
      System.out.println("Tu número no es primo.");
      }
  }
}
