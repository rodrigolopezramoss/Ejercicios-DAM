public class Ejercicio28{
  public static void main(String[] args){

    String s;

    System.out.println("Juguemos a piedra, papel o tijeras.");

    System.out.println("Turno del jugador 1:");
    s = System.console().readLine();

    String n;
    System.out.println("¿Turno del jugador 2?");
    n = System.console().readLine();   
    
    int p = 0;
    
    switch (s){
      case "piedra":
		p=1;
        break;
      case "papel":
		p=2;
	    break;
	  case "tijeras":	    
		p=3;
        break;
      default:
        System.out.println("Error");
     }
    int q=0;
    switch (n){
      case "piedra":
		q=1;
        break;
      case "papel":
		q=2;
	    break;	    
	  case "tijeras":
		q=3;
        break;
      default:
        System.out.println("Error");
      }
    if ((p==1)&&(q==1)){
	  System.out.println("Empate");
	  }
    if ((p==1)&&(q==2)){
	  System.out.println("Ganajugador 2.");
	  }
    if ((p==1)&&(q==3)){
	  System.out.println("Gana jugador 1.");
	  }
    if ((p==2)&&(q==1)){
	  System.out.println("Gana jugador 1.");
	  }
    if ((p==2)&&(q==2)){
	  System.out.println("Empate");
	  }
    if ((p==2)&&(q==3)){
	  System.out.println("Gana jugador 2.");
	  }
    if ((p==3)&&(q==1)){
	  System.out.println("Gana jugador 2.");
	  }
    if ((p==3)&&(q==2)){
	  System.out.println("Gana jugador 1.");
	  }
    if ((p==3)&&(q==3)){
	  System.out.println("Empate");
	  }  
  }
}
