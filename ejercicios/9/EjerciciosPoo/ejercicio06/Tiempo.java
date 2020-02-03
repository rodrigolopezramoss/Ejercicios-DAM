package ejercicio06;

public class Tiempo {
  private int hora;
  private int minuto;
  private int segundo;
  int horaux;
  int minutaux;
  int segundaux;
  
  public Tiempo(int horas,int minutos,int segundos) {
	this.hora = horas;
	this.minuto = minutos;
	this.segundo = segundos;
	
	this.horaux = this.hora;
	this.minutaux = this.minuto;
	this.segundaux = this.segundo;
  }
  
  public String toString() {
	return "Este intervalo de tiempo es de " + this.hora + "h " + this.minuto + "m " + this.segundo + "s";
  }
  
  public void suma(Tiempo intervalo) {
	this.horaux = this.hora;
	this.minutaux = this.minuto;
	this.segundaux = this.segundo;
	
	this.horaux += intervalo.hora;
	this.minutaux += intervalo.minuto;
	this.segundaux += intervalo.segundo;
	
	if (this.segundaux > 60) {
	  this.minutaux++;
	  this.segundaux -= 60;
	}
	if (this.minutaux > 60) {
	  this.horaux++;
	  this.minutaux -= 60;
	}
	System.out.println();
	System.out.println("La suma de ambos intervalos de tiempo da este otro:");
	System.out.println(this.horaux + "h " + this.minutaux + "m " + this.segundaux + "s");
  }
  
  
  public void resta(Tiempo intervalo) {
	this.horaux = this.hora;
	this.minutaux = this.minuto;
	this.segundaux = this.segundo;
	
	this.horaux -= intervalo.hora;
	this.minutaux -= intervalo.minuto;
	this.segundaux -= intervalo.segundo;
	
	if (this.segundaux < 0) {
	  this.minutaux --;
	  this.segundaux += 60;
	}
	if (this.minutaux < 0) {
	  this.horaux--;
	  this.minutaux += 60;
	}
	
	System.out.println();
	System.out.println("La resta de ambos intervalos de tiempo da este otro:");
	System.out.println(this.horaux + "h " + this.minutaux + "m " + this.segundaux + "s");
  }
	  
}
