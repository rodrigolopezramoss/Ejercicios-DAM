package ejercicio09;

import ejercicio08.Terminal;

public class Movil extends Terminal {
  
  double cobro = 0;
  String tarifa;
  
  
	public Movil(String numero, String tarifas) {
		super(numero);
		this.tarifa = tarifas;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " Tarificados: " + this.cobro + " euros.";
	}
	
	
	@Override
	public void llama(Terminal tel,double tiempo) {
		super.llama(tel, tiempo);
		
		double contador = 0;
		
		
		
		if (this.tarifa == "rata") {
		  while (tiempo > 10) {
		    tiempo -= 10;
			contador++;
		  }
		  
		  this.cobro += contador/100;
		}else if (this.tarifa == "mono") {
			while (tiempo > 5) {
			    tiempo -= 5;
				contador++;
			  }
			this.cobro += contador/100;
		} else if (this.tarifa == "bisonte") {
			while (tiempo > 2) {
			    tiempo -= 2;
				contador++;
			  }
			this.cobro += contador/100;
		} 
	}
}
