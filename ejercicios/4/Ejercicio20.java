public class Ejercicio20{
  public static void main(String[] args){

    String linea;

    System.out.println("Dame un número y te diré si es capicúa");

    System.out.println("Escribe un número positivo cualquiera, de 5 cifras como máximo.");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );

    int y=x;
    int d5= y % 10;
    int z= y/10;
    int d4= z % 10;
    int t= z/10;    
    int d3= t % 10;
    int s= t/10;    
    int d2= s % 10;  
    int w= s/10;    
    int d1= w % 10;       
    int r= d1+d2*10+d3*100+d4*1000+d5*10000;    
    
    if(r==x){
    System.out.println("Su número es capicúa.");
    } else{
    System.out.println("Su número no es capicúa.");
    }
  }
}
