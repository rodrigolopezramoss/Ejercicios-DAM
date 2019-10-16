public class Ejercicio17{
  public static void main(String [] args){

    String linea;

    System.out.println("Dame un número y te daré los siguientes cien, y encima luego te los sumo.");

    System.out.println("Escribe un número cualquiera.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );

    int suma = 0;
    if (x<0){
      System.out.println("El número no es positivo.");
      } else{
        for(int i = 1;i <=100;i++){
          x++;
          suma +=x;
          System.out.print(x +", ");
          }
          System.out.println("La suma total de estos números es: "+ suma);
        }
  }
}
