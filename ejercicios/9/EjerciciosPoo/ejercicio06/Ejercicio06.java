package ejercicio06;

public class Ejercicio06 {
  public static void main (String[]args) {
	Tiempo t1 = new Tiempo(1, 20, 30);
	Tiempo t2 = new Tiempo(5, 45, 50);
	Tiempo t3 = new Tiempo(3, 54, 60);
	
    System.out.println(t1);
    System.out.println(t2);
    
    t1.suma(t2);
    
    t2.resta(t1);
    t2.resta(t3);
    
  }
}
