public class Ejercicio14{
  public static void main(String[] args){

    String linea;

    System.out.println("Vas ha tener que darme un número");

    System.out.println("Escribe el número");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );
        

    if (x%2==0){
    System.out.println("Es par.");
    } else {
    System.out.println("Es impar.");
    }

    if (x%5==0){
    System.out.println("Es múltiplo de cinco.");
    } else {
    System.out.println("No es múltiplo de cinco.");
    }

  }
}
