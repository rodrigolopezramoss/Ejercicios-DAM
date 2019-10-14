public class Ejercicio14{
  public static void main(String[] args){
    
    String linea;
    System.out.println("Hagamos potencias.");
    
    System.out.println("Escríbeme la base.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );
    
    System.out.println("Escríbeme el exponente (positivo).");
    linea = System.console().readLine();
    int y;
    y = Integer.parseInt( linea );
    int t = 0;
    int z = 0;
    for(int i = 0;i<= y;i++){
        
      if (i<=2){
        z= x * x;
        
      }else if (i>2){
        t= x * x;
        z= t * x;
      }
    }
    System.out.println("Resultado: "+ z);  
  }
}
