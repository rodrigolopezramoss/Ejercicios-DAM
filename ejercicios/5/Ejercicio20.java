import java.util.Scanner;

public class Ejercicio20{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el caracter: ");
    String caracter = s.nextLine();
    
    System.out.print("Introduce la altura de la pirámide: ");
    int altura = Integer.parseInt(s.nextLine());
    /*
    int espa = altura;
    int ancho = 1;
    int alterespa = 1;
    for (int j = 0;j <= altura;j++){
    
      for (int k = 0;k <= espa;k++){
        System.out.print(" ");
        }
      for (int i = 0;i < ancho;i++){
        System.out.print(caracter);
        if (ancho >= 2){ 
          for (int e = 0;e < alterespa;e++){
          System.out.print(" ");
          }
        }
      }
      System.out.println();
      ancho++;
      espa--;
      alterespa+=2;
    
    }*/
    
    int altura2 = 1;
    int i = 0;
    int espa = altura - 1;
    int alter = 0;

    while (altura2 < altura) {
      // inserta espacios delante
      for (i = 1; i <= espa; i++) {
        System.out.print(" ");
        }
      // pinta la línea
      System.out.print(caracter);
      for (i = 1; i < alter; i++) {
        System.out.print(" ");
        }
      if (altura2> 1) {
        System.out.print(caracter);
        }
      System.out.println();
      
      altura2++;
      espa--;
      alter += 2;
    } // while ////////////////////////////
    
    // base de la pirámide
    for (i = 1; i < altura*2; i++) {
    System.out.print(caracter);
    }
  }
}
    
 
