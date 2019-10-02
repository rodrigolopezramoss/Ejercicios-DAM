public class Ejercicio04{
  public static void main(String[] args){
      
    String linea;

    System.out.print("¿Cuántos días trabajas a la semana? ");    
    linea = System.console().readLine();
    int dia;
    dia = Integer.parseInt( linea );
    
    System.out.print("¿Cuántas horas cada día? ");    
    linea = System.console().readLine();
    int hor;
    hor = Integer.parseInt( linea );
    
    double hort= hor*dia;
    
    System.out.println("Usted trabaja "+ hort + " horas al mes.");
    

    if (hort>40) {
		double x= hort-40; 
      double t = (((40*12)+(16 * x ))* 4.2);
      System.out.println("Usted debería cobrar "+ t + " euros al mes, aproximadamente.");

    } else {
      double t = 12 * hor * dia * 4.2;
      System.out.println("Usted debería cobrar "+ t + " euros al mes, aproximadamente.");
    } 



  }
}
