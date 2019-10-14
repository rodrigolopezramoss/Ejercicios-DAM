public class Ejercicio13{
  public static void main(String [] args){

    String linea;

    System.out.println("Dame 10 números.");

    System.out.println("Escríbelos.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );
    
    int i = 0;
    int y = 0;
    int z = 0;
    
    while(i<=10){
      i++;
      if(Integer.parseInt(System.console().readLine())>=0){
        y++;
        } else{
        z++;
        }
    }
    System.out.printf("Hay "+ z +" negativos y "+ y +" positivos.");
  }
}
