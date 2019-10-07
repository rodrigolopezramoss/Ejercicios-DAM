public class Ejercicio13{
  public static void main(String[] args){

    String linea;

    System.out.println("Vas ha tener que darme tres números enteros.");

    System.out.println("Escribe el primero");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );
        
    System.out.println("El segundo");
    linea = System.console().readLine();
    int y;
    y = Integer.parseInt( linea );    

    System.out.println("El tercero y último");
    linea = System.console().readLine();
    int z;
    z = Integer.parseInt( linea );

    if ((x>y)&&(x>z)&&(y>z)){
    System.out.println(x +" "+ y +" "+ z);
    } else if ((x>y)&&(x>z)&&(z>y)){
    System.out.println(x +" "+ z +" "+ y);
    } else if ((y>x)&&(y>z)&&(x>z)){
    System.out.println(y +" "+ x +" "+ z);
    } else if ((y>x)&&(y>z)&&(z>x)){
    System.out.println(y +" "+ z +" "+ x);
    } else if ((z>y)&&(z>x)&&(x>y)){
    System.out.println(z +" "+ x +" "+ y);
    } else if ((z>y)&&(z>x)&&(y>x)){
    System.out.println(z +" "+ y +" "+ x);
    } 

  }
}
