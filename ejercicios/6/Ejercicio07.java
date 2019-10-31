public class Ejercicio07{
  public static void main(String[]args){
  System.out.println("Quiniela.");
  
  System.out.println("Comienza: ");
  
  int a = 0;
  int b = 0;
  String c;
  for (int i = 1; i <= 14; i++) {
    int apu =((int)(Math.random()*3 + 1));
    int apu2 =((int)(Math.random()*3 + 1));
    int apu3 =((int)(Math.random()*3 + 1));
    
    switch (apu){
      case 1:
        a = 1;
        System.out.print("|" + a + "--");
      break;
      case 2:
        c = "X";
        System.out.print("|" + c + "--");
      break;
      case 3:
        b = 2;
        System.out.print("|" + b + "--");
      break;
    }
    switch (apu2){
      case 1:
        a = 1;
        System.out.print(a + "--");
      break;
      case 2:
        c = "X";
        System.out.print(c + "--");
      break;
      case 3:
        b = 2;
        System.out.print(b + "--");
      break;
    }
    switch (apu3){
      case 1:
        a = 1;
        System.out.print(a + "|");
      break;
      case 2:
        c = "X";
        System.out.print(c + "|");
      break;
      case 3:
        b = 2;
        System.out.print(b + "|");
      break;
      
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
