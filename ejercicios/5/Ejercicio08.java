public class Ejercicio08{
  public static void main(String[] args){

    String linea;

    System.out.println("Dame un número y te diré su tabla de multiplicar.");

    System.out.println("Escribe un número cualquiera.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );
    
    for(int i= 0;i<=10;i++){
      System.out.println(x + " x " + i + " = " + (x * i));
    }
  }
}
