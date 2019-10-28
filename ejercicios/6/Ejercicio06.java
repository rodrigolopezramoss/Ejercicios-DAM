public class Ejercicio06{
  public static void main(String[]args){
  System.out.println("Numero aleatorio del 0 al 100, adivinalo.");
  
  String res;
  
  int num =((int)(Math.random()*101));
  System.out.println("Comienza: ");
  
  for (int i = 1; i <= 5; i++) {
    res = System.console().readLine();
    int x;
    x = Integer.parseInt( res );
    
    if (x == num){
      System.out.println("¡¡Enhorabuena, has acertado!!");
      break;
    } else {
      System.out.println("Intentalo de nuevo...");
    }
  }
  
  
  }
}
