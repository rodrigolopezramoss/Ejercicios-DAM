public class Ejercicio02{
  public static void main(String[]args){
  System.out.println("Baraja francesa ");
  

  
  for (int i = 1; i <= 1; i++) {
    int bar =((int)(Math.random()*4 + 1));
    switch(bar){
      case 1:
        int picas =((int)(Math.random()*13 + 1));
        switch (picas){
          case 1:
            System.out.println("As de picas.");
          break;
          case 11:
            System.out.println("J de picas.");
          break;
          case 12:
            System.out.println("Q de picas.");
          break;
          case 13:
            System.out.println("K de picas.");
          break;
          default:
            System.out.println(picas + " de picas.");
        }
      break;
      case 2:
        int cora =((int)(Math.random()*13 + 1));
        switch (cora){
          case 1:
            System.out.println("As de corazones.");
          break;
          case 11:
            System.out.println("J de corazones.");
          break;
          case 12:
            System.out.println("Q de corazones.");
          break;
          case 13:
            System.out.println("K de corazones.");
          break;
          default:
            System.out.println(cora + " de corazones.");
        }
      break;
      case 3:
        int trevol =((int)(Math.random()*13 + 1));
        switch (trevol){
          case 1:
            System.out.println("As de trévoles.");
          break;
          case 11:
            System.out.println("J de trévoles.");
          break;
          case 12:
            System.out.println("Q de trévoles.");
          break;
          case 13:
            System.out.println("K de trévoles.");
          break;
          default:
            System.out.println(trevol + " de trévoles.");
        }
      break;
      case 4:
        int dia =((int)(Math.random()*13 + 1));
        switch (dia){
          case 1:
            System.out.println("As de diamantes.");
          break;
          case 11:
            System.out.println("J de diamantes.");
          break;
          case 12:
            System.out.println("Q de diamantes.");
          break;
          case 13:
            System.out.println("K de diamantes.");
          break;
          default:
            System.out.println(dia + " de diamantes.");
        }
      break;
    }
  }
  
  }
}
