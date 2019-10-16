public class Ejercicio15{
  public static void main(String[] args){
    
    String linea;
    System.out.println("Hagamos más potencias.");
    
    System.out.println("Escríbeme la base.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );
    
    System.out.println("Escríbeme el exponente (positivo).");
    linea = System.console().readLine();
    int y;
    y = Integer.parseInt( linea );
    
    int t = 0;
    double z = 1;
    if (y==0){
      z=1;
    }
    if(y>0){
      for(int i=1;i<=y;i++){
        z= z * x;
        t++;
        System.out.println(x +"^"+ t +", resultado: "+ z); 
        }
    }

  }
}
