public class Ejercicio06 {
  public static void main(String[] args){
    
    String linea;
    
    System.out.println("Vamos a calcular lo que tarda en caer un objeto,pero,¿Desde qué altura?");
   
    System.out.print("Introduce la altura ");    
    linea = System.console().readLine();
    double a;
    a = Double.parseDouble( linea );
   
    double t = Math.sqrt((2*a)/9.81) ;
    
    System.out.print("Tarda "+ t +" segundos en caer desde "+a+" metros.");   
    
    
    
  }
}
