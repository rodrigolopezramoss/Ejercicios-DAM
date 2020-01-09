package pruebapoo;


public class GAtera {
	public static void main(String[]args) {
		GatoSimple g01 = new GatoSimple();
		GatoSimple g02 = new GatoSimple();

		
		System.out.println(g01.getSexo());
		System.out.println(g02.getSexo());

		g01.seApareaCon(g02);

	}
}
