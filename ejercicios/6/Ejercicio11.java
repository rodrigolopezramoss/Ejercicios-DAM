public class Ejercicio11{
  public static void main(String[]args){
  System.out.println("Generación de notas aleatorias.");
  
  System.out.println("Comienza: ");
  
  int sus = 0;
  int suf = 0;
  int bie = 0;
  int not = 0;
  int sob = 0;
  
  for (int i = 0; i <= 20; i++) {
    int nota =((int)(Math.random()*5)+1);
    
    switch (nota){
      case 1:
        System.out.println("Suspenso");
        sus++;
      break;
      case 2:
        System.out.println("Suficiente");
        suf++;
      break;
      case 3:
        System.out.println("Bien");
        bie++;
      break;
      case 4:
        System.out.println("Notable");
        not++;
      break;
      case 5:
        System.out.println("Sobresaliente");
        sob++;
      break;
    }
  }
  
  System.out.println();
  System.out.println("Hay "+ sus +" suspensos.");
  System.out.println("Hay "+ suf +" suficientes.");
  System.out.println("Hay "+ bie +" bienes.");
  System.out.println("Hay "+ not +" notables.");
  System.out.println("Hay "+ sob +" sobresalientes.");
  
  }
}
