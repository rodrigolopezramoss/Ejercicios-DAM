public class Ejercicio11{
  public static void main(String[] args){

    String linea;

    System.out.println("Este progrma dice el tiempo que queda para la medianoche");

    System.out.println("Dime la hora: ");
    linea = System.console().readLine();
    double hor;
    hor = Double.parseDouble( linea );

    double t= 24 - hor;

    System.out.println("Quedan " +(t*3600)+" horas para la medianoche.");

  }
}
