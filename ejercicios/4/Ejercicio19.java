public class Ejercicio19{
  public static void main(String[] args){

    String linea;

    System.out.println("Dame un número y te daré su número de cifras");

    System.out.println("Escribe un número cualquiera, de 5 cifras como máximo.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );

    if((x>0)&&(x<10)){
    System.out.println("Su número de cifras es: 1");
    }else if((x>=10)&&(x<=99)){
    System.out.println("Su número de cifras es: 2");
    }else if((x>=100)&&(x<=999)){
    System.out.println("Su número de cifras es: 3");
    }else if((x>=1000)&&(x<=9999)){
    System.out.println("Su número de cifras es: 4");
    }else if((x>=10000)&&(x<=99999)){
    System.out.println("Su número de cifras es: 5");
    }
  }
}
