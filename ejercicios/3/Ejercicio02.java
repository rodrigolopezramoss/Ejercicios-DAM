 public class Ejercicio02{
  public static void main(String[] args){
    
    String linea;

    System.out.print("Introduce un número: ");    
    linea = System.console().readLine();
    int num;
    num = Integer.parseInt( linea );
  
    double y = num * 166.386;

    System.out.println( num + " euros equivalen a " + y +" pesetas");
  }
}
