public class Ejercicio09{
  public static void main(String[] args){
      
    String linea;

    System.out.print("Introduzca el radio de la base del cono: ");    
    linea = System.console().readLine();
    double rad;
    rad = Integer.parseInt( linea );
    
    double rad2 = rad*rad;
    
    System.out.print("Introduzca ahora su altura: ");    
    linea = System.console().readLine();
    double alt;
    alt = Integer.parseInt( linea );
    
//    double x = 1/3;
    double y = 3.14159265359;
    double z = y*rad2;    
    double t = z*alt;
    double r = t/3;
    
    System.out.println("El volumen del cono es: "+ r);
  }
}
