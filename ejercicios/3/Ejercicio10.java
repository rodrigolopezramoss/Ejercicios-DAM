 public class Ejercicio10{
  public static void main(String[] args){
    
    String linea;

    System.out.print("Introduce el número de megabytes: ");    
    linea = System.console().readLine();
    int MB;
    MB = Integer.parseInt( linea );
  
    double KB = MB * 1024;

    System.out.println( MB + " megabytes equivalen a " + KB +" kilobytes");
  }
}
