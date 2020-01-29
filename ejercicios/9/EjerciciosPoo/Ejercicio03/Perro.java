package Ejercicio03;

public class Perro extends Mamifero {
	
  public void come(String comida){
	if (comida.equals("hueso")) {
	  System.out.println("¡Cuanto me gusta! Muchas gracias.");
	} else {
	  System.out.println("No voy a decirte que no.");
	}
  }

  public void juega(String juguete){
	if ((juguete.equals("pelota"))||(juguete.equals("palo"))) {
	  System.out.println("Tíramelo, tíramelo.");
	} else {
	  System.out.println("Cómo me divierto, yuuuju,");
	}
  }
  
}
