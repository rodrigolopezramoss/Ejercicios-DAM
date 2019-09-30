 public class Ejercicio06{
  public static void main(String[] args){
    
    String linea;

    System.out.print("Introduce la base del triángulo: ");    
    linea = System.console().readLine();
    int bas;
    bas = Integer.parseInt( linea );
    
    System.out.print("Introduce también su altura: ");    
    linea = System.console().readLine();
    int alt;
    alt = Integer.parseInt( linea );

    double z = (bas * alt)/2;

    System.out.println("El área del rectángulo es: " + z);


  }
}
