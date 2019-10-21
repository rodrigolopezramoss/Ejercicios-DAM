import java.util.Scanner;

public class Ejercicio69{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la altura de la pirámide: ");
    int altura = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduce el caracter: ");
    String caracter = s.nextLine();
    
    int ancho = 1;
    int espacios = altura;
    for (int i = 0;i <= altura;i++){
      //Espacios delanteros de cada fila
      for (int k = 0;k <= espacios;k++){
        System.out.print(" ");
        
      }
      //Pinta flanco izquierdo
      for (int j = 0;j < ancho;j++){
        System.out.print(caracter);
      }
    
      //Pinta la parte central
      if (i % 2 == 0){
      System.out.print("****");
      } else {
        System.out.print("    ");
      }
      
      //Pinta flanco derecho
      for (int j = 0;j < ancho;j++){
        System.out.print(caracter);
      }
      
      System.out.println();
      
      ancho++;
      espacios--;
    }
  }
}
