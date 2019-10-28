public class Ejercicio05{
  public static void main(String[]args){
  System.out.println("Numeros aleatorios del 100 al 199, 50 veces.");

  int min = 199;
  int max = 0;
  int nom = 0;
  int media = 0;
  for (int i = 1; i <= 50; i++) {
    int num =((int)(Math.random()*100 + 100));
    System.out.print(num + ", ");
    media += num;
    nom = num;
    if (nom > max){
      max = nom;
    }
    
    if (nom < min){
      min = nom;
    }
    
  }
  System.out.println();
  System.out.println("El mínimo es: "+ min);
  System.out.println("El maximo es: "+ max);
  System.out.println("La media es: "+ (media / 50));
  }
}
