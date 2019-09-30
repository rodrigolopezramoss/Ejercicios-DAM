public class Ejercicio01 {
  public static void main(String[] args) {
    String linea;

    System.out.print("Introduce un número: ");    
    linea = System.console().readLine();
    int num;
    num = Integer.parseInt( linea );
    
    System.out.print("Introduce otro número: ");
    linea = System.console().readLine();
    int num2;
    num2 = Integer.parseInt( linea );
    
    double mul = num * num2;

    System.out.println("El resultado de la multiplicación de ambos números es: " + mul );
  }
}
