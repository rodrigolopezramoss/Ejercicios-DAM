public class Ejercicio12{
  public static void main(String[] args){

    System.out.println("Ejecutemos la serie de fibonacci.");
    int i = 0;
    int x = 0;
    int y = 1;
    int f = 0;
    System.out.print(x + ", ");
    System.out.print(y + ", ");

    while(f<=y){
      f = x + y;
      x = y;
      y = f;
      i++;
      System.out.print(f + ", ");
      if (i==15){
        break;
        }
    }


  }
}
