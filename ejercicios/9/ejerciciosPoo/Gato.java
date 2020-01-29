package ejerciciosPoo;

public class Gato extends Mamifero {
	
	
	
	
  public void come(String comida){
	  if (comida.equals("pescado")) {
		System.out.println("Me encanta los peces,¿Es que lo sabías?");
	  } else {
		System.out.println("Me lo comeré, pero hubiera preferido otra cosa");
	  }
  }
	  
}
