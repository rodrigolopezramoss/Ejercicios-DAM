public class Ejercicio09{
  public static void main(String [] args){

    String linea;

    System.out.println("Dame un número y te daré su número de cifras.");

    System.out.println("Escribe un número cualquiera.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );
    
    int y = x;
    int i = 0;
    do{
      y/=10;
      i++;
      }while(y>0);
    System.out.println(x + " tiene "+ i +" dígitos.");
  }
}
