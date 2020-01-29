package ejerciciosPoo;

public class Coche extends Vehiculo{

	private String generaMarcas() {
		int num = ((int)(Math.random()*3)+1);
		String marcas="";
		
		switch (num) {
		  case 1 :
			marcas ="Renault" ;
			break;
		  case 2 :
			marcas ="Mercedes" ;
			break;
		  case 3 :
			marcas ="Toyota" ;
			break;
		}
		
		return marcas;
	}
	
	public int getkilometrosRecorridos() {
		  return this.kilometrosRecorridos;
	  }
	  
  public void quemaRuedas() {
	int nume = ((int)(Math.random()*3)+1);
		
	switch (nume) {
	  case 1:
		System.out.println("Se ha quemado rueda correctamente.");
		break;
	  case 2:
		System.out.println("Mal, te has cargado el coche y las gomas estan rotas, bien hecho.");
		break;
	  case 3:
		System.out.println("En el momento justo y con la potecia adecuada. Ha sido maravilloso.");
		break;
	}
	
  }
	  
	
	public void marca() {
	    this.marca = generaMarcas();
	    System.out.println(this.marca);
	  }
}

