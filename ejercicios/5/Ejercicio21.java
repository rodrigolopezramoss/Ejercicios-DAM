public class Ejercicio21{
  public static void main(String[] args){

    String linea;

    System.out.println("Calculemos la media de varios números.");

    System.out.println("Escribe números(El primero no cuenta).");
    linea = System.console().readLine();
    double x;
    x = Double.parseDouble( linea );
    
    double par = 0;
    int y = 0;
    int i = 0;
    int imp = 0;
    int impint = 0;
    while(x>=0){
      linea = System.console().readLine();
      x = Double.parseDouble( linea );
      i+= x;
      if (x<0){
        i-= x;
        }
      y++;
      
      if (x%2!=0){
        imp+= x;
        impint++;
        } else if ((x%2==0)&&(x>par)){
            par = x;
          }
      
    }
    
    System.out.println("Cantidad de números introducidos: " + y);
    System.out.println("Media de impares: " + (imp / impint));
    System.out.println("El mayor número par es: "+ par);

  }
}
