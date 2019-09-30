 public class Ejercicio05{
  public static void main(String[] args){
    
    String linea;

    System.out.print("Introduce la base del rectángulo: ");    
    linea = System.console().readLine();
    int bas;
    bas = Integer.parseInt( linea );
    
    System.out.print("Introduce también su altura: ");    
    linea = System.console().readLine();
    int alt;
    alt = Integer.parseInt( linea );

    double z = bas * alt;

    System.out.println("El área del rectángulo es: " + z);


  }
}
