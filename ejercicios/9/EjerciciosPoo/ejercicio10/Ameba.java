package ejercicio10;

public class Ameba {

	private int peso = 3;
	

	public String toString() {
		
		return "Soy una ameba y peso " + this.peso + " microgramos.";
	}
	
	public void come(int comida) {
		this.peso += comida;
		this.peso--;
	}

	public void come(Ameba otra) {
		this.peso += otra.peso;
		otra.peso = 0;
		this.peso--;
	}
}
