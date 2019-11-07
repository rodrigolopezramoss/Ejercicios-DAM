public class Ejercicio13{
  public static void main(String[]args){
  System.out.println("Tiramos de dos dados;infinitamente hasta que ambos valgan lo mismo.");
  

  
  for (int i = 1; i <= 100; i++) {
    int dad1 =((int)(Math.random()*6 + 1));
    int dad2 =((int)(Math.random()*6 + 1));
    System.out.print(dad1 + " " + dad2);
    System.out.println();
    
    if (dad1 == dad2){
      System.out.println("Dan lo mismo.");
      break;
    }
  }

  }
}
