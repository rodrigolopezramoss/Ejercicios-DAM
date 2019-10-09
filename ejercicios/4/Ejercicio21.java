public class Ejercicio21{
  public static void main(String[] args){

    String linea;
    String t;


    System.out.println("Veamos si apruebas o no programación.");

    System.out.println("Escribe la nota de tu primer examen.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );

    System.out.println("Escribe la nota del segundo examen.");
    linea = System.console().readLine();
    int y;
    y = Integer.parseInt( linea );
    
    double z= (x+y)/2 ;
    
    if(z>=5){
    System.out.println("Su nota es: "+z+", has aprobado. ");
    } else if(z<5){

    System.out.println("¿Qué nota has sacado en la recuperación?(apto/no apto)");
    t = System.console().readLine();
    
    
      if (t.equals("apto")){
        System.out.println("Tu nota es un 5");
      } else{
        System.out.println("Tu nota es un "+z);
      }
    }   
  }
}
