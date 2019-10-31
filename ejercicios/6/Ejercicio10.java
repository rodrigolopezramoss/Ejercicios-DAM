public class Ejercicio10{
  public static void main(String[]args){
  System.out.println("Generación de líneas.");
  
  System.out.println("Comienza: ");
  
  String c;
  for (int i = 0; i <= 10; i++) {
    int num =((int)(Math.random()*5)+1);
    int lin =((int)(Math.random()*40)+1);
    
    for(int j = 0; j <= lin ; j++){
      switch (num){
        case 1:
          c = "*";
          System.out.print(c);
        break;
        case 2:
          c = "-";
          System.out.print(c);
        break;
        case 3:
          c = "=";
          System.out.print(c);
        break;
        case 4:
          c = ".";
          System.out.print(c);
        break;
        case 5:
          c = "|";
          System.out.print(c);
        break;
      }
    }
    System.out.println();
  }
  
  }
}
