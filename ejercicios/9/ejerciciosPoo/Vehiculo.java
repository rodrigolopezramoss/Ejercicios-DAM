package ejerciciosPoo;

public abstract class Vehiculo {
	
	String marca;
	String modelo;
	int recorrido;
	int vehiculosCreados = 0;
	int kilometrosRecorridos = 0;	
	public static int kilometrosTotales = 0;
	
	public void anda(int km) {
		this.kilometrosRecorridos += km;
		kilometrosTotales += km;
	}
	
	public static int getkilometrosTotales() {
		  return kilometrosTotales;
	}  
	
	
}
