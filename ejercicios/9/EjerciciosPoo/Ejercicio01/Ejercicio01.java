package Ejercicio01;

public class Ejercicio01 {
	public static void main (String[] args) {
		Caballo c01 = new Caballo();
		
		int probabilidad =((int)(Math.random()*2)+ 1);
		
		if (probabilidad == 1) {
			c01.relincha();
			
		}else {
			c01.bufa();
		}
		
	}
}