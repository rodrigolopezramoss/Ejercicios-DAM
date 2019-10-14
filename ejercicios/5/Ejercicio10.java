public class Ejercicio10{
  public static void main(String[] args){

    String linea;

    System.out.println("Calculemos la media de varios números.");

    System.out.println("Escribe números.");
    linea = System.console().readLine();
    double x;
    x = Double.parseDouble( linea );

    int y = 0;
    int i = 0;

    while(x>=0){
      linea = System.console().readLine();
      x = Double.parseDouble( linea );
      i+=x;
      y++;
    }
    System.out.println("Suma total: " + i);
    System.out.println("Cantidad de números introducidos: " + y);
    System.out.println("Media: " + (i / y));

  }
}
