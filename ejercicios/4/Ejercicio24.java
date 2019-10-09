public class Ejercicio24{
  public static void main(String[] args){

    String linea;

    System.out.println("Nómina tediosamente desglosada.");
    System.out.println("1 - Programador junior");
    System.out.println("2 - Prog. senior");
    System.out.println("3 - Jefe de proyecto");


    System.out.println("Introduze tu condición, del 1 al 3:");
    linea = System.console().readLine();
    int x;
    x=Integer.parseInt( linea );

    System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
    linea = System.console().readLine();
    int y;
    y=Integer.parseInt( linea );

    System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado):");
    linea = System.console().readLine();
    int z;
    z=Integer.parseInt( linea );

    
    
    double s = 0;
    
    switch (x){
      case 1:
        s=950;
        break;
      case 2:
		s=1200;
        break;
      case 3:
		s=1600;
        break;
      default:
        System.out.println("Va a ser que no.");
    }
    
    int d = 30 ;
    
    if (y>=1){
		d*=y;
		}
    
    double irpf=0;
    int i=0;
    switch (z){
      case 1:
        irpf=0.25;
        i=25;
        break;
      case 2:
        irpf=0.20;
        i=20;
        break;
      default:
        System.out.println("Eso no es un día, ni una promoción...");
    }
    System.out.println("Sueldo base: "+ s+"€");    
    System.out.println("Dietas ("+y+" viajes): "+ d+"€") ;    
    System.out.println("Sueldo bruto: "+ (s + d)+"€"); 
    System.out.println("Retención IRPF ("+i+"%): "+ (s*irpf)+"€");    
    System.out.println("Sueldo neto: "+ (s-(s*irpf))+"€") ;    
  }
}
