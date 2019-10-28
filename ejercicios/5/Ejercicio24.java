import java.util.Scanner;

public class Ejercicio24{
  public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    
    String linea;

    System.out.println("Hagamos una piramide de n números.");

    System.out.print("Introduce la altura n de la pirámide: ");
    int altura = Integer.parseInt(s.nextLine());
    

    int repe = 1;
    int num = 1;
    int ancho = 1;
    int espacios = altura;
    for (int i = 1;i <= altura;i++){
      num = 1;
      //Espacios delanteros de cada fila
      for (int k = 0;k <= espacios;k++){
        System.out.print(" ");
        
      }
      //Pinta la fila
      for (int j = 0;j < ancho;j++){
        if (num ==repe){
          break;
        }
        System.out.print(num);
        num++;
      }
      if (num >=repe){
        for (int a = repe; a > 0; a--) {
          System.out.print(a);
        }
      }
      
      System.out.println();
      
      repe++;
      ancho+=2;
      espacios--;
    }
  }
}
