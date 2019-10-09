public class Ejercicio26{
  public static void main(String[] args){

    String linea;

    System.out.println("¡Vamos al cine!");

    System.out.println("Introduze el número de personas:");
    linea = System.console().readLine();
    int a;
    a=Integer.parseInt( linea );

    String d;
    System.out.println("Introduze ahora el día:");
    d = System.console().readLine();
 
    String t;
    System.out.println("¿Tienes tarje ta CineCampa?(s/n)");
    t = System.console().readLine(); 
    
    int e =8; 
     
    switch (d){
      case "miércoles":
		e= 5;
        break;
      case "jueves":
		e= 0;
        break;
      default:
        System.out.println("Pues nada...");
    }

    switch (t){
      case "s":
		e= 5;
        break;
      case "n":
		e= 0;
        break;
      default:
        System.out.println("Pues nada...");
    }

    System.out.println("Gracias. Aquí tiene el desglose de su compra");        
  }
}
