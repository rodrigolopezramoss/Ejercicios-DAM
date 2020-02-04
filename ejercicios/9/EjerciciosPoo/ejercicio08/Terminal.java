package ejercicio08;

public class Terminal {
  
  String numeroTel;
  int tiempoUso = 0;
  
  
  
  
  public Terminal(String numero) {
	this.numeroTel = numero;
  }
  
  public String toString() {
	return this.numeroTel + ": " + this.tiempoUso + "s de conversación.";
  }
  
  public void llama(Terminal tel, int tiempo) {
	this.tiempoUso += tiempo;
	tel.tiempoUso += tiempo;
  }
  
}
