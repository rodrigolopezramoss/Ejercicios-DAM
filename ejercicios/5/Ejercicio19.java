public class Ejercicio19{
  public static void main(String [] args){

    String caracter;
    String linea;
    
    System.out.println("Dame un caracter y te haré una pirámide, también deberás darme su altura.");

    System.out.println("Escribe un carácter.");
    caracter = System.console().readLine();
    
    System.out.println("Dame la altura que quieras.");
    linea = System.console().readLine();
    int y;
    y = Integer.parseInt( linea );
    
    int base = 1;
    int lon = 1;
    int espa = y - 1;
    
    do{
      for (int i = 1; i <= espa; i++) {
        System.out.print(" ");
      }
    
      for (int i = 1; i <= lon; i++) {
        System.out.print(caracter);
      }
      
      System.out.println();
            
      base++;
      espa--;
      lon += 2;
      
    }while (base <= y);
  }
}
