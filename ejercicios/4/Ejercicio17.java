public class Ejercicio17{
  public static void main(String[] args){

    String linea;

    System.out.println("Dame un número y te daré su última cifra");


    System.out.println("Escribe un número cualquiera");
    linea = System.console().readLine();
    double x;
    x = Double.parseDouble( linea );

    double c= x%10;

    if(c<0){
    System.out.println("Su última cifra es: "+(c*(-1)));
    }else{
    System.out.println("Su última cifra es: "+c);
    }
  }
}
