public class Ejercicio23{
  public static void main(String [] args){

    String linea;

    System.out.println("Mete números y ya paro yo.");

    System.out.println("Escribe números(El primero no cuenta).");
    linea = System.console().readLine();
    double x;
    x = Double.parseDouble( linea );
    
    int y = 0;
    int i = 0;
    
    while(x>=0){
      linea = System.console().readLine();
      x = Double.parseDouble( linea );
      i+= x;
      if (x<0){
        i-= x;
      }
      y++;
      
      if (i >= 10000){
        System.out.println("Total: "+ i);
        break;
      }
    }

  
  }
}
