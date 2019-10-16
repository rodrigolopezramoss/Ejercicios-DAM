public class Ejercicio18{
  public static void main(String [] args){

    String linea;

    System.out.println("Dame dos numeros distanciados entre sí, que te voy a decis los números enteros que existen entre ellos de 7 en 7.");

    System.out.println("Escribe un número cualquiera.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );
    
    System.out.println("Escribe otro número.");
    linea = System.console().readLine();
    int y;
    y = Integer.parseInt( linea );
    
    if (x==y){
    System.out.println("Escribe OTRO número.");
      }

    if (x<y){
      for(int i = x;i <= y;i+=7){
        System.out.print(x +", ");
        x+=7;
      }
      } else if (y<x){
        for(int i = y;i <= x;i+=7){
          System.out.print(y +", ");
          y+=7;
        }
      }
  }
}
