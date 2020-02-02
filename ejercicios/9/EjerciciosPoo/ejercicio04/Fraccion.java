package ejercicio04;

public class Fraccion {

  int numerador;
  int denominador;


  public void determinar() {
	  int numerar = ((int)(Math.random()*10) + 1);
	  int denominar = ((int)(Math.random()*10) + 1);
	  
	  this.numerador = numerar;
	  this.denominador = denominar;
	  
	  System.out.println("El numerador es: " + this.numerador);
	  System.out.println("El denominador es: " + this.denominador);
	  System.out.println();

  }
  
  public int getNumerador() {
		return this.numerador;
	}
	
  public int getDenominador() {
		return this.denominador;
	}
  
  
  public void invierte() {
	int otro = 0;
	
	otro = this.numerador;
	this.numerador = denominador;
	this.denominador = otro;
	System.out.println("Fracción invertida ------------");

	System.out.println("El numerador es: " + this.numerador);
	System.out.println("El denominador es: " + this.denominador);
	
	System.out.println();
  }

  
  
  public void simplifica() {
	  int numerador2 = this.numerador ;
	int denominador2 = this.denominador ;
	System.out.println("Fracción simplificada --------------");
	
	if((numerador2 % 2 == 0)&(denominador2 % 2 == 0)) {
	  while((numerador2 % 2 == 0)&(denominador2 % 2 == 0)) {
		numerador2 /= 2;
		denominador2 /= 2;
	  }
	}else if ((numerador2 % 3 == 0)&(denominador2 % 3 == 0)) { 
	  while((numerador2 % 3 == 0)&(denominador2 % 3 == 0)) {
		numerador2 /= 3;
		denominador2 /= 3;
	  }
	}else if ((numerador2 % 5 == 0)&(denominador2 % 5 == 0)) {
	  while((numerador2 % 5 == 0)&(denominador2 % 5 == 0)) {
		numerador2 /= 5;
		denominador2 /= 5;
	  }
	}
	  System.out.println("En numerador es:" + numerador2);
	
	 
	  System.out.println("En denominador es:" + denominador2);
	  System.out.println();
  }

  public void multiplica(Fraccion otra) {
	System.out.println("La multiplicación es:");
	
	System.out.println(this.numerador * otra.numerador + "/" + this.denominador * otra.denominador );
	System.out.println();
  }

  public void divide(Fraccion otra) {
	System.out.println("La división es:");
		
	System.out.println(this.numerador * otra.denominador + "/" + this.denominador * otra.numerador);
	System.out.println();
  }

}
