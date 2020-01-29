package ejerciciosPoo;

public class Pinguino extends Ave {
  
  int paciencia = 0;
  
  
  public void come(String comida){
	if (comida.equals("pescado")) {
	  System.out.println("Rico rico, delicius.");
	} else {
	  System.out.println("A mi me gusta...");
	}
  }
	
  public void vuela(){
	if (paciencia < 5) {
	  System.out.println("Soy un pingüino, no puedo volar.");
	  paciencia ++;
	} else {
	  System.out.println("Déjalo");
	}
  }

}
