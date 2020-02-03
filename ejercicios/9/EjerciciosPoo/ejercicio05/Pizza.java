package ejercicio05;

public class Pizza {
  String tamano;
  String tipo;
  String estado;
  boolean servida = false;
  
  static int pedidas = 0;
  static int servidas = 0;

  public  Pizza(String tamaño, String tipo) {
	this.tamano = tamaño;
	this.tipo = tipo;
	  
	pedidas++;
	this.estado = " pedida";
	
  }

  public void sirve() {
	if(this.estado == " pedida") {
	  servidas++;
	  this.servida = true;
	  this.estado = " servida";
    }else {
      System.out.println("Esta pizza ya esta pedida");
    }
  }
  
  public String toString() {
	return "Pizza " + this.tamano + " " + this.tipo + "," + this.estado;
  }

  public static int  getTotalPedidas() {
  	return pedidas;
  }
  
  public static int  getTotalServidas() {
  	return servidas;
  }  
}
