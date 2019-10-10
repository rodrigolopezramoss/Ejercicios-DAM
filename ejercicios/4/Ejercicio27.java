public class Ejercicio27{
  public static void main(String[] args){

    String s;

    System.out.println("¿Quieres una tarta?");

    System.out.println("Introduze el sabor(manzana, fresa o chocolate)");
    s = System.console().readLine();

    String n;
    System.out.println("¿Con nata?(s/n)");
    n = System.console().readLine();
 
    String o;
    System.out.println("¿Con un nombre?(s/n)");
    o = System.console().readLine(); 
    
    double p = 0;
    
    switch (s){
      case "manzana":
        p = 18;
      break;
      case "chocolate":
        String c;
        System.out.println("¿Chocolate negro o blanco?");
        c = System.console().readLine();
        if (c.equals("negro")){
		  p = 14;
	    } else{
		  p = 15;
	    }  
	  break;	    
      case "fresa":
        p = 16;
      break;
      default:
     }
    System.out.println("Tarta sabor "+s+": "+p+"€");
     
    double nat= 0;
    double nom= 0;
    if(n .equals("s")){
	  nat=2.50;
      System.out.println("Con nata: "+nat+"€");
    }
    if(o .equals("s")){
	  nom=2.75;	 
      System.out.println("Con nombre: "+nom+"€");
    }
    System.out.println("Total: "+(p+nat+nom)+"€");     
  }
}

