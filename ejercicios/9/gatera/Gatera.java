package gatera;

public class Gatera {
	public static void main(String[]args) {
		Gato g1 = new Gato("Fantasma");
		Gato g2 = new Gato("Pitipu");
		Gato g3 = new Gato("Tirion");
		Gato g4 = new Gato();

		
		g1.maulla();
		g2.maulla();
		g4.maulla();
		
		g4.setNombre("Whisky");
		g4.maulla();
		System.out.println(g2.getNombre());
	}
}
