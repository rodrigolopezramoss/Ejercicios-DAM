public class Ejercicio04{
  public static void main(String[]args){
  System.out.println("Numeros aleatorios del 1 al 10, 20 veces.");

  
  for (int i = 1; i <= 20; i++) {
    int num =((int)(Math.random()*11));
    System.out.println(num + " ");
  }
  
  }
}
