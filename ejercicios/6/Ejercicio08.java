public class Ejercicio08{
  public static void main(String[]args){
  System.out.println("Quiniela 2.0");
  
  System.out.println("Comienza: ");
  
  int a = 0;
  int b = 0;
  String c;
  for (int i = 1; i <= 14; i++) {
    int uno =((int)(Math.random()*6 + 1));
    int x =((int)(Math.random()*6 + 1));
    
    int uno2 =((int)(Math.random()*6 + 1));
    int x2 =((int)(Math.random()*6 + 1));
    
    int uno3 =((int)(Math.random()*6 + 1));
    int x3 =((int)(Math.random()*6 + 1));

    switch (uno){
      case 1:
        b = 1;
        System.out.print("|" + b + "--");
      break;
      case 2:
        b = 1;
        System.out.print("|" + b + "--");
      break;
      case 3:
        b = 1;
        System.out.print("|" + b + "--");
      break;
      default:
        switch (x){
          case 1:
            c = "X";
            System.out.print("|" + c + "--");
          break;
          case 2:
            c = "X";
            System.out.print("|" + c + "--");
          break;
          default:
          System.out.print("|2--");
        }
      }
      
    switch (uno2){
      case 1:
        b = 1;
        System.out.print(b + "--");
      break;
      case 2:
        b = 1;
        System.out.print(b + "--");
      break;
      case 3:
        b = 1;
        System.out.print(b + "--");
      break;
      default:
        switch (x2){
          case 1:
            c = "X";
            System.out.print(c + "--");
          break;
          case 2:
            c = "X";
            System.out.print(c + "--");
          break;
          default:
          System.out.print("2--");
        }
      }

    switch (uno3){
      case 1:
        b = 1;
        System.out.print(b + "|");
      break;
      case 2:
        b = 1;
        System.out.print(b + "|");
      break;
      case 3:
        b = 1;
        System.out.print(b + "|");
      break;
      default:
        switch (x3){
          case 1:
            c = "X";
            System.out.print(c + "|");
          break;
          case 2:
            c = "X";
            System.out.print(c + "|");
          break;
          default:
          System.out.print("2|");
        }
      }

      
    System.out.println();
  }
  int pleno =((int)(Math.random()*4 + 1));
  switch (pleno){
    case 1:
      b = 0;
      System.out.print(b + " - 0 goles para el partido 15");
    break;
    case 2:
      b = 1;
      System.out.print(b + " - 1 gol para el partido 15");
    break;
    case 3:
      b = 2;
      System.out.print(b + " - 2 goles para el partido 15");
    break;
    case 4:
      c = "M";
      System.out.print(c + " - Mas de 3 goles para el partido 15");
    break;
    }
  }
}
