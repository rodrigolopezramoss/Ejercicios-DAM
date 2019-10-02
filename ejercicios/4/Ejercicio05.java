public class Ejercicio05{
  public static void main(String[] args){
      
    String linea;
    
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");


    System.out.print("Introduce el valor de a ");    
    linea = System.console().readLine();
    double a;
    a = Double.parseDouble( linea );
    
    System.out.print("Introduce el valor de b ");    
    linea = System.console().readLine();
    double b;
    b = Double.parseDouble( linea );
    
    double x = (0-b)/a;
    
    System.out.println("X vale: " + x);
    


  }
}
