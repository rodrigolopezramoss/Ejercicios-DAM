package perrera;

public class Perrera {
	public static void main(String[]args) {
		Perro p1 = new Perro("Espectro");
		Perro p2 = new Perro("Nora");
		
		
		p1.ladra();
		p1.sePresenta();
		p1.ladra();
		p1.seComunica(p2);
	}
}
