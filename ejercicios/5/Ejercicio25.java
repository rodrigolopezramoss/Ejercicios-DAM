public class Ejercicio25{
  public static void main(String [] args){

    String linea;

    System.out.println("Dime un número y te lo vuelvo del revés.");

    System.out.println("Escribe el número.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );
    
    int j = 1;
    int y = x;
    int i = 0;
    int z = x;
    int k = 0;
    do{
      z/=10;
      k++;
      }while(z>0);
      
    int s = k-1;
    System.out.println(s);
    while(j<k){
      y/=10;
      i=y;
      i*=10;
      x-=i;
      x*=Math.pow(10,s);
      System.out.println(x);
      i=y;
      x+=y;
      System.out.println(x);
      j++;
    }
  }
}
