package ejerciciosPoo;

public class Bicicleta extends Vehiculo {
	
  private String generaMarcas() {
    int num = ((int)(Math.random()*3)+1);
	String marcas="";
	  
 	switch (num) {
 	  case 1 :
	    marcas ="Specialized" ;
		break;
	  case 2 :
		marcas ="Trek" ;
		break;
	  case 3 :
		marcas ="Merida" ;
		break;
	}
	  
	return marcas;
  }
  
	
  
  public void caballea() {
	  int posibilidad = ((int)(Math.random()*3)+1);
	  switch (posibilidad) {
	  case 1:
		System.out.println("El caballito a sido realizado correctamente.");
		break;
	  case 2:
		System.out.println("Mal, te has caído y te ha dolido. Mucho.");
		break;
	  case 3:
		System.out.println("Ha sido el caballito más perfecto que he visto, pura vilguería.");
		break;
	  }
  }
  
  
  public int getkilometrosRecorridos() {
	  return this.kilometrosRecorridos;
  }
  
  
  public void marca() {
	this.marca = generaMarcas();
	System.out.println(this.marca);
  }
	
	
}
