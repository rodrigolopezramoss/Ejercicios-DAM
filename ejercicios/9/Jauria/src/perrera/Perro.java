package perrera;

public class Perro {
	String color;
	String raza;
	String sexo;
	int edad;
	String nombre;
	String numeroChip;
	double peso;
	int tamaño;
	String ánimo;
	
	
	public Perro (String n) {
		this.nombre = n;
	}
	
	void sePresenta() {
		int num =((int)(Math.random()*2)+ 1);
		System.out.println("Me llamo " + this.nombre);
		
		/*if (num == 1) {
			System.out.println("¡¡¡Hoy estoy feliiz!!!");
		}else {
			System.out.println("Hoy estoy triiste...");
		}*/
	}
	
	void ladra () {
		System.out.println(" Guau");
	}
	
	void seComunica(Perro t) {
		System.out.println("¿Que tal, " + t + "?");
	}
}
