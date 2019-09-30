 public class Ejercicio04{
  public static void main(String[] args){
    
    String linea;

    System.out.print("Introduce un número: ");    
    linea = System.console().readLine();
    int num;
    num = Integer.parseInt( linea );
    
    System.out.print("Introduce otro número: ");    
    linea = System.console().readLine();
    int num2;
    num2 = Integer.parseInt( linea );
  
    double x = num + num2;
    double y = num - num2;
    double z = num * num2;
    double t = num / num2;

    System.out.println("Su suma es: " + x);
    System.out.println("Su resta es: " + y);    
    System.out.println("Su multiplicación es: " + z);
    System.out.println("Su división es: " + t );

  }
}
