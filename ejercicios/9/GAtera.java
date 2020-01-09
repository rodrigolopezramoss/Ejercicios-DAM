package pruebapoo;


public class GAtera {
	public static void main(String[]args) {
		GatoSimple g01 = new GatoSimple();
		GatoSimple g02 = new GatoSimple();

		
		System.out.println(g01.getSexo());
		System.out.println(g02.getSexo());

		GatoSimple g03 = g01.seApareaCon(g02);
		if (g03 != null) {
			System.out.println(g03.getSexo());
		}

	}
}
