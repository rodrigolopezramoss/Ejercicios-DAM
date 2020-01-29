package Ejercicio03;

public class Canario extends Ave {
  
  public void come(String comida){
	if (comida.equals("alpiste")) {
	  System.out.println("Me vuelve loco, aparta o te pico.");
	} else {
	  System.out.println("Tampoco es que tenga otra opción.");
	}
  }
}
