public class Ejercicio07{
  public static void main(String [] args){
    
    String linea;

    System.out.println("Intenta adivinar la contraseña de la caja fuerte.");

    System.out.println("Escribe un número positiva cualquiera, de 4 cifras.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );

    int i = 2354;
    while(x!=i){
      System.out.println("Lo siento, esa no es la combinación..."); 
      break;
    }
    if(x==i){
      System.out.println("¡Enhorabuena, esa es la combinación!");       

    }
  }
}
