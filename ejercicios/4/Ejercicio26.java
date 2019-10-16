public class Ejercicio26{
  public static void main(String[] args){

    String linea;

    System.out.println("¡Vamos al cine!");

    System.out.println("Introduze el número de personas:");
    linea = System.console().readLine();
    int p;
    p=Integer.parseInt( linea );

    String d;
    System.out.println("Introduze ahora el día:");
    d = System.console().readLine();
 
    String t;
    System.out.println("¿Tienes tarjeta CineCampa?(s/n)");
    t = System.console().readLine(); 
    
    int e =8;
    int tot = e * p;
    
    System.out.println("Gracias, aquí tiene.");
    
    switch (d){
      case "miércoles":
        e= 5;
        System.out.println("Precio por entrada individual: "+e);
        System.out.println("Total: "+ tot);
      break;
      case "jueves":
		if (p%2==0){
		  e=11*(p/2);
      tot = e;
		  System.out.println("Precio por entrada por parejas: "+11);
      System.out.println("Total: "+ tot);
      } else {
	  	  e=(((p-1)/2)*11);
        tot = e + 8;
	  	  System.out.println("Precio por entrada por parejas: "+11);
        System.out.println("Precio por entrada individual: "+8);
        System.out.println("Total: "+ tot);
        }
      break;
      default:
        tot = e * p;
        System.out.println("Entradas individuales: "+p);
        System.out.println("Precio por entrada individual: "+e);
        System.out.println("Total: "+ tot);
    }
    double de=0;
    switch (t){
      case "s":
        de= tot * 0.10;
        break;
      case "n":
        de= 0;
        break;
      default:
        System.out.println("Pues nada...");
    }
    
    System.out.println("Descuento de: "+ de);
    switch (d){
      case "miércoles":
        System.out.println("A pagar: "+ (tot-de));
      break;
      case "jueves":
        if (p%2==0){
          System.out.println("A pagar: "+ (tot-de));	
        } else {
          System.out.println("A pagar: "+ (tot-de));
        }
        break;
      default:
        System.out.println("A pagar: "+ (tot-de));
    }
  }
}
