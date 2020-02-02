package ejercicio04;

public class Ejercicio04 {
  public static void main (String[]args) {
	Fraccion f01 = new Fraccion();
	Fraccion f02 = new Fraccion();
	
	f01.determinar();
	f02.determinar();
	
	f01.invierte();
	
	f01.simplifica();
	
	f01.multiplica(f02);

	f01.divide(f02);
	
  }
}
