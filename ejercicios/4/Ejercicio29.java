public class Ejercicio29{
  public static void main(String[] args){

    String s;

    System.out.println("¿Que has desayunado hoy?");

    System.out.println("¿Palmera, donut o pitufo?");
    s = System.console().readLine();

    String n;
    System.out.println("¿Con qué bebida?(zumo/café)");
    n = System.console().readLine();
   
    double p = 0;
    
    switch (s){
      case "palmera":
        p = 1.40;
        System.out.println("Palmera: " + p + "€");
      break;
      case "pitufo":
        String c;
        System.out.println("¿Pitufo con aceite o con tortilla?");
        c = System.console().readLine();
      
        if (c.equals("aceite")){
		  p = 1.20;
		  } else{
		  p = 1.60;
		  }
	    System.out.println("Pitufo de " + c + ": " + p + "€");
      break;
      case "donut":
        p = 1;
        System.out.println("Donut: " + p + "€");
      break;
      default:
      }

    double z= 0;
    if(n .equals("zumo")){
	  z = 1.50;
      System.out.println("Con zumo: " + z + "€");
      } else {
	  z = 1.20;
      System.out.println("Con café: " + z + "€");
	  }
    System.out.println("Total: " + (p + z) + "€");     
  }
}
