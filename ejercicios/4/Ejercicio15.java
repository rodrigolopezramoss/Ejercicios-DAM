public class Ejercicio15{
  public static void main(String[] args){

    String linea;

    System.out.println("Vamos a hacer una pirámide");

    System.out.println("Escríbe un carácter cualquiera");
    linea = System.console().readLine();
    String x = System.console().readLine();
    x = Integer.parseInt( linea );
        

    System.out.println("La dirección de la pirámide, siendo 1-arriba, 2-abajo, 3-derecha, 4-izquierda.");
    linea = System.console().readLine();
    int y;
    y = Integer.parseInt( linea );

    if (y==1){
    System.out.println("       "+x);
    System.out.println("      "+x+" "+x);
    System.out.println("     "+x+" "+x+" "+x);
    System.out.println("    "+x+" "+x+" "+x+" "+x);
    System.out.println("   "+x+" "+x+" "+x+" "+x+" "+x);
    System.out.println("  "+x+" "+x+" "+x+" "+x+" "+x+" "+x);
    System.out.println(" "+x+" "+x+" "+x+" "+x+" "+x+" "+x+" "+x);
    System.out.println(x+" "+x+" "+x+" "+x+" "+x+" "+x+" "+x+" "+x);
    } else if (y==2){
    System.out.println(x+" "+x+" "+x+" "+x+" "+x+" "+x+" "+x+" "+x);
    System.out.println(" "+x+" "+x+" "+x+" "+x+" "+x+" "+x+" "+x);
    System.out.println("  "+x+" "+x+" "+x+" "+x+" "+x+" "+x);
    System.out.println("   "+x+" "+x+" "+x+" "+x+" "+x);
    System.out.println("    "+x+" "+x+" "+x+" "+x);
    System.out.println("     "+x+" "+x+" "+x);
    System.out.println("      "+x+" "+x);
    System.out.println("       "+x);
    }
    if (y==3){
    System.out.println(x);
    System.out.println(x+" "+x);
    System.out.println(x+" "+x+" "+x);
    System.out.println(x+" "+x+" "+x+" "+x);
    System.out.println(x+" "+x+" "+x+" "+x+" "+x);
    System.out.println(x+" "+x+" "+x+" "+x);
    System.out.println(x+" "+x+" "+x);
    System.out.println(x+" "+x);
    System.out.println(x);
    } else if (y==4){
    System.out.println("        "+x);
    System.out.println("      "+x+" "+x);
    System.out.println("    "+x+" "+x+" "+x);
    System.out.println("  "+x+" "+x+" "+x+" "+x);
    System.out.println(x+" "+x+" "+x+" "+x+" "+x);
    System.out.println("  "+x+" "+x+" "+x+" "+x);
    System.out.println("    "+x+" "+x+" "+x);
    System.out.println("      "+x+" "+x);
    System.out.println("        "+x);
    }

  }
}
