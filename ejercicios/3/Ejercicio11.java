 public class Ejercicio11{
  public static void main(String[] args){
    
    String linea;

    System.out.print("Introduce el número de kilobytes: ");    
    linea = System.console().readLine();
    int KB;
    KB = Integer.parseInt( linea );
  
    double MB = KB / 1024;

    System.out.println( KB + " kilobytes equivalen a " + MB +" megabytes");
  }
}
