public class Ejercicio01{
  public static void main(String[] args) {


    System.out.print("¿Qué día es hoy? ");
    String respuesta = System.console().readLine();
    
    
    if (respuesta.equals("Lunes")) {
    System.out.println("¡Enhorabuena!, a primera programación.");
    }
    else if (respuesta.equals("Martes")) {
    System.out.println("¡Enhorabuena!, a primera entornos de desarrollo.");
    } 
    
    else if (respuesta.equals("Miercoles")) {
    System.out.println("¡Enhorabuena!, a primera programación.");
    } 
    
    else if (respuesta.equals("Jueves")) {
    System.out.println("¡Enhorabuena!, a primera programación, otra vez.");
    } 
    
    else if (respuesta.equals("Viernes")) {
    System.out.println("¡Enhorabuena!, a primera sistemas informáticos.");
    } 
    else {
    System.out.println("Pues nada...");
    }
  }
}
