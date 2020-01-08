package gatera;

public class Gato {
	String color;
	String sexo;
	String raza;
	int edad;
	String nombre;
	String numeroChip;
	
	//Métodos (comportamiento)
	public Gato() {
	}
	
	public Gato(String n) {
		this.nombre = n;
	}
	
	void maulla(){
		if(this.nombre == null) {
			System.out.print("Soy un gato anónimo ");
		}else {
			System.out.print("Soy " + this.nombre);
		}
		System.out.println(" Miaaaaau");
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
