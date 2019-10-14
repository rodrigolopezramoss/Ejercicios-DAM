public class Ejercicio11{
  public static void main(String [] args){

    String linea;

    System.out.println("Dame un número y te daré los siguientes cinco con alguna sorpresa.");

    System.out.println("Escribe un número cualquiera.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );

    int y = 0;
    int z = 0;
    int t = 0;
    for(int i = 1;i <=5;i++){
      x++;    
      y = x ;
      z = y * y;
      t = y * y * y;
      System.out.printf("%-6s  %-6s  %-6s\n",y,z,t);
    }
  }
}
