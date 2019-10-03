public class Ejercicio09 {
  public static void main(String[] args){
    
    String linea;
    
    System.out.println("Hagamos una ecuación de segundo grado");
   
    System.out.print("Introduce a: ");    
    linea = System.console().readLine();
    double a;
    a = Double.parseDouble( linea );

    System.out.print("Introduce b: ");    
    linea = System.console().readLine();
    double b;
    b = Double.parseDouble( linea );

    System.out.print("Introduce c: ");    
    linea = System.console().readLine();
    double c;
    c = Double.parseDouble( linea );
    
    Double r = Math.sqrt((b*b)-(4*a*c));
    
    Double xy = (-b+r)/(2*a) ;
    
    Double xx = (-b-r)/(2*a) ; 
    
    System.out.println("La ecuación da como resultado que X = " +xy+ " y que X = "+xx  );
 
  }
}
