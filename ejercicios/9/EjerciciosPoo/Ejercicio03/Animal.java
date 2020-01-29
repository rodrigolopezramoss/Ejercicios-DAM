package Ejercicio03;


public class Animal {
  
  String NombreCient;
  private String sexo;
  
  public void Sexo () {
	int probabilidad = ((int)(Math.random()*2)+1);
	
	if (probabilidad == 1) {
	  this.sexo = "Macho";
	}else {
	  this.sexo = "Hembra";
	}
  }
  
  public void duerme() {
	System.out.println("Zzzz");
  }
  
  
  public void come(){
	System.out.println("No esta mal esto.");
  }
  
  
  

}
