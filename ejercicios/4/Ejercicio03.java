public class Ejercicio03{
  public static void main(String[] args) {

    String linea;

    System.out.print("Dime un número del uno al siete: ");    
    linea = System.console().readLine();
    int dia;
    dia = Integer.parseInt( linea );
  

    if (dia==1) {
    System.out.println("Bienvenido, es lunes.");
    
    } else if (dia==2) {
    System.out.println("Hoy es martes.");
    
    } else if (dia==3) {
    System.out.println("Hoy es miércoles.");
    
    } else if (dia==4) {
    System.out.println("Hoy es jueves.");
    
    } else if (dia==5) {
    System.out.println("Hoy es viernes, por fin.");
    
    } else if (dia==6) {
    System.out.println("Hoy es sábado.");
    
    } else if (dia==7) {
    System.out.println("Hoy es domingo.");
    } else {
    System.out.println("¿Estas seguro?");
    } 

  }
}
