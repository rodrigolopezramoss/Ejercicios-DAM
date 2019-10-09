public class Ejercicio22{
  public static void main(String[] args){

    String linea;
    String x;
    System.out.println("Veamos cuánto queda para el fin de semana .");

    System.out.println("Escribe el día(lunes a viernes).");
    x = System.console().readLine();



    System.out.println("Escribe la hora.Si es viernes, antes de las 15:00");
    linea = System.console().readLine();
    double y;
    y=Double.parseDouble( linea );
    
    int hor= 111 ;
    int dia= 0;
       
    switch (x){
      case "lunes":
        dia=1;
        break;
      case "martes":
        dia=2;
        break;
      case "miércoles":
        dia=3;
        break;
      case "jueves":
        dia=4;
        break;
      case "viernes":
        dia=5;
        break;
      default:
        System.out.println("Eso no es un día...");
    }
    switch (dia){
      case 1:
        System.out.println("Quedan "+(hor - y)+" horas.");
        break;
      case 2:
        System.out.println("Quedan "+(hor - (y + (24*2)))+" horas.");
        break;
      case 3:
        System.out.println("Quedan "+(hor - (y + (24*3)))+" horas.");
        break;
      case 4:
        System.out.println("Quedan "+(hor - (y + (24*4)))+" horas.");
        break;
      case 5:
        System.out.println("Quedan "+(15 - y )+" horas.");
        break;
      default:
        System.out.println("no mames...");
    }
  }
}
