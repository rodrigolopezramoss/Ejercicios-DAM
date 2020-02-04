package ejercicio07;

public class Zona {
  
  private int entradasPorVender;
  
  public Zona(int n){
	entradasPorVender = n;
  }
  
  public int getEntradasPorVender() {
	return entradasPorVender;
  }
	/**
	* Vende un n�mero de entradas.
	* Comprueba si quedan entradas libres antes de realizar la venta.
	*
	* @param n n�mero de entradas a vender
	*/
  public void vender(int n) {
	if (this.entradasPorVender == 0) {
	  System.out.println("Lo siento, las entradas para esa zona est�n agotadas.");
	} else if (this.entradasPorVender < n) {
	  System.out.println("S�lo me quedan " + this.entradasPorVender + " entradas para esa zona.");
	}
	
	if (this.entradasPorVender >= n) {
	  entradasPorVender -= n;
	  System.out.println("Aqu� tiene sus " + n + " entradas, gracias.");
	}
  }
}
