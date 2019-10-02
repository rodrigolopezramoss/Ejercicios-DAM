public class Ejercicio07{
  public static void main(String[] args){
      
    String linea;

    System.out.print("Introduce el importe de luz: ");    
    linea = System.console().readLine();
    int luz;
    luz = Integer.parseInt( linea );
    
    System.out.print("Introduce el importe de agua: ");    
    linea = System.console().readLine();
    int agu;
    agu = Integer.parseInt( linea );
  
    System.out.print("Introduce el importe de gas: ");    
    linea = System.console().readLine();
    int gas;
    gas = Integer.parseInt( linea );
 
    double t = luz + agu + gas;

    System.out.println("IVA: "+ t*0.21 + " euros.");
    System.out.println("Importe total: "+ t + " euros.");
    System.out.println("Importe total con IVA incluido: "+ t*1.21 + " euros.");
  }
}
