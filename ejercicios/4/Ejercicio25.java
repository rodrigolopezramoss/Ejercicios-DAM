public class Ejercicio25{
  public static void main(String[] args){

    String linea;

    System.out.println("Pedido de banderas.");

    System.out.println("Introduze la altura de la bandera en cm:");
    linea = System.console().readLine();
    int a;
    a=Integer.parseInt( linea );

    System.out.println("Introduze ahora el ancho:");
    linea = System.console().readLine();
    int b;
    b=Integer.parseInt( linea );
    
    String z;
    System.out.println("¿Quieres un escudo bordado?(s/n)");
    z = System.console().readLine();

    double ar = b*a; 
    double c = ar * 0.01;
    double e = 0;
    double g = 3.25;
    switch (z){
      case "s":
		e= 2.50;
        break;
      case "n":
		e= 0;
        break;
      default:
        System.out.println("Pues nada...");
    }
    System.out.println("Gracias. Aquí tiene el desglose de su compra");    
    System.out.println("Bandera de "+ar+" cm2: "+ c+"€") ;    
    System.out.println("Con escudo: "+ e+"€"); 
    System.out.println("Gastos de envío: "+ g+"€");    
    System.out.println("Total: "+ (c+e+g)+"€");    
  }
}
