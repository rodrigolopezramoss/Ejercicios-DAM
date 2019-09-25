public class Ejercicio05{
  public static void main(String[] args){
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";

    System.out.printf("%-7s  %-7s  %-7s  %-7s  %-7s\n","L","M","X","J","V");
    System.out.printf("%-7s  %-7s  %-7s  %-7s  %-7s\n",azul +"PRO",naranja +"EDD",azul +"PRO",azul +"PRO",morado +"SINF");
    System.out.printf("%-7s  %-7s  %-7s  %-7s  %-7s\n",azul +"PRO",verde +"LM",azul +"PRO",azul +"PRO",morado +"SINF");
    System.out.printf("%-7s  %-7s  %-7s  %-7s  %-7s\n",azul +"PRO",verde +"LM",azul +"PRO",naranja +"EDD",morado +"SINF");
    System.out.printf("%-7s  %-7s  %-7s  %-7s  %-7s\n",rojo +"BBDD",morado +"SINF",rojo +"BBDD",naranja +"EDD",blanco +"FOL");
    System.out.printf("%-7s  %-7s  %-7s  %-7s  %-7s\n",rojo +"BBDD",morado +"SINF",rojo +"BBDD",verde +"LM",blanco +"FOL");
    System.out.printf("%-7s  %-7s  %-7s  %-7s  %-7s\n",rojo +"BBDD",morado +"SINF",rojo +"BBDD",verde +"LM",blanco +"FOL");
  }
}