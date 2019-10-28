public class Ejercicio01{
  public static void main(String[]args){
  System.out.println("Tiramos de tres dados.");
  
  int suma = 0;

  
  for (int i = 1; i <= 3; i++) {
    int ale =((int)(Math.random()*6 + 1));
    System.out.println(ale);
    suma += ale;
  }
  System.out.println("Suma total: "+ suma);
  }
}
