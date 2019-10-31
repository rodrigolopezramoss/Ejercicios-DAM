public class Ejercicio09{
  public static void main(String[]args){
  System.out.println("Generación de numeros pares.");
  
  System.out.println("Comienza: ");
  
  int x = 0;
  for (int i = 0; i <= 1000; i++) {
    int num =((int)(Math.random()*101));
    if (num % 2 == 0){
      System.out.print(num + " ");
      x++;
    }
    
    if (num == 24){
      break;
    }
    
  }
  System.out.println();
  System.out.println("Han salido " + x + " números.");
  
  }
}
