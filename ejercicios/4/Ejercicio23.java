public class Ejercicio23{
  public static void main(String[] args){

    String linea;

    System.out.println("Calculemos el precio final de un producto según su base imponible");

    System.out.println("Introduzca la base imponible: ");
    linea = System.console().readLine();
    double x;
    x=Double.parseDouble( linea );

    String y ;
    System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    y = System.console().readLine();


    String z ;
    System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    z = System.console().readLine();

    double iva=0;
    int i=0;
    switch (y){
      case "general":
        iva=0.21;
        i=21;
        break;
      case "reducido":
        iva=0.10;
        i=10;
        break;
      case "superreducido":
        iva=0.04;
        i=4;
        break;
      default:
        System.out.println("Va a ser que no.");
    }

    System.out.println("Base imponible: "+ x);    
    System.out.println("IVA ("+i+"%): "+ (x*iva)) ;    
    System.out.println("Precio con IVA: "+ (x+(x*iva))); 

    double pro=0 ;
    switch (z){
      case "nopro":
        pro=0;
        System.out.println("Cód. promo. ("+z+"): "+ (x*pro));
        break;
      case "mitad":
        pro=0.50;
        System.out.println("Cód. promo. ("+z+"): "+ (x*pro));
        break;
      case "meno5":
        pro=5;
        System.out.println("Cód. promo. ("+z+"): "+ 5);
        break;
      case "5porc":
        pro=0.05;
        System.out.println("Cód. promo. ("+z+"): "+ (x*pro));
        break;
      default:
        System.out.println("Eso no es un día, ni una promoción...");
    }

    if (pro == 5){
    System.out.println("TOTAL: "+ ((x*(1+iva))-5));
    }else{
    System.out.println("TOTAL: "+ ((x*(1+iva))-(x*pro)));
    }    
  }
}
