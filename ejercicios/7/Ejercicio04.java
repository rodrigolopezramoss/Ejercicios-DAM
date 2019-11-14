public class Ejercicio04{
  public static void main(String[]args){
  System.out.println("Triple array.");
  
  
  int [] numero = new int [20];
  int[] cuadrado = new int[20];
  int[] cubo = new int[20];
  
  System.out.println();
  System.out.println("Array número:");
  
  for(int i = 0; i <= 19; i++){
    numero [i] = ((int)(Math.random()*100) + 1);
    System.out.println("Número ["+ (i + 1) +"]:" + numero[i]);
  }
  
  System.out.println();
  System.out.println("Array número al cuadrado:");
  
    for(int j = 0; j <= 19; j++){
    cuadrado [j] = numero [j] * numero [j];
    System.out.println("Número ["+ (j + 1) +"]:" + cuadrado[j]);
  }
  
  System.out.println();
  System.out.println("Array número al cubo:");
  
    for(int k = 0; k <= 19; k++){
    cubo [k] = cuadrado [k] * numero [k];
    System.out.println("Número ["+ (k + 1) +"]:" + cubo[k]);
  }
  
  }
}
