public class Ejercicio02{
  public static void main(String[] args) {

    String linea;

    System.out.print("Qué hora es: ");    
    linea = System.console().readLine();
    int hor;
    hor = Integer.parseInt( linea );
  

    if ((6<hor)&&(hor<12)) {
    System.out.println("¡Buenos días!");
    } 
    
    else if ((13<hor)&&(hor<20)) {
    System.out.println("¡Buenas tardes!");
    } 
    
    else if ((21<hor)||(hor<5)) {
    System.out.println("¡Buenas noches!");
    } 
    else {
    System.out.println("¿Estas seguro?");
    } 

  }
}
