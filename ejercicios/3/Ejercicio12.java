 public class Ejercicio12{
  public static void main(String[] args){
    
    String linea;

    System.out.print("Introduce la nota del primer examen de programación: ");    
    linea = System.console().readLine();
    int N1;
    N1 = Integer.parseInt( linea );

    System.out.print("Introduce la nota que querrías como media: ");    
    linea = System.console().readLine();
    int N2;
    N2 = Integer.parseInt( linea );


    double N3 = 2*N2-N1 ;

    System.out.println("La nota que necesitas es: " + N3);
  }
}
