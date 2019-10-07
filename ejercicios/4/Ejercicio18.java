public class Ejercicio18{
  public static void main(String[] args){

    String linea;

    System.out.println("Dame un número y te daré su primera cifra");

    System.out.println("Escribe un número cualquiera, de 5 cifras como máximo.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );

    if((x>0)&&(x<10)){
    System.out.println("Su primera cifra es: "+x);
    }else if((x>=10)&&(x<=99)){
    int c= x/10;
    System.out.println("Su primera cifra es: "+c);
    }else if((x>=100)&&(x<=999)){
    int c= x/100;
    System.out.println("Su primera cifra es: "+c);
    }else if((x>=1000)&&(x<=9999)){
    int c= x/1000;
    System.out.println("Su primera cifra es: "+c);
    }else if((x>=10000)&&(x<=99999)){
    int c= x/10000;
    System.out.println("Su primera cifra es: "+c);
    }
  }
}
