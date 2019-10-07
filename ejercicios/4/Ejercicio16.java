public class Ejercicio16{
  public static void main(String[] args){

    String r1;
    String r2;
    String r3;
    String r4;
    String r5;
    String r6;
    String r7;
    String r8;
    String r9;
    String r10;




    System.out.println("¿Te es fiel tu pareja? Responde sí o no.");


    System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    r1 = System.console().readLine();

    System.out.println("Ha aumentado sus gastos de vestuario");
    r2 = System.console().readLine();

    System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
    r3 = System.console().readLine();

    System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    r4 = System.console().readLine();

    System.out.println("No te deja que mires la agenda de su teléfono móvil");
    r5 = System.console().readLine();

    System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    r6 = System.console().readLine();

    System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    r7 = System.console().readLine();

    System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    r8 = System.console().readLine();

    System.out.println("Has notado que últimamente se perfuma más");
    r9 = System.console().readLine();

    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    r10 = System.console().readLine();
    
    int p= 0;
        
    if (r1.equals("si")){
      p += 3;
    } 

    if (r2.equals("si")){
      p+=3;
    } 

    if (r3.equals("si")){
      p+=3;
    } 

    if (r4.equals("si")){
      p+=3;
    } 

    if (r5.equals("si")){
      p+=3;
    } 

    if (r6.equals("si")){
      p+=3;
    } 

    if (r7.equals("si")){
      p+=3;
    } else{
      p += 0;
    }

    if (r8.equals("si")){
      p+=3;
    } 

    if (r9.equals("si")){
      p+=3;
    } 

    if (r10.equals("si")){
      p+=3;
    } 

    System.out.println("Tu puntuación: "+ p);

    if ((p<=10)&&(0<=p)){
    System.out.println("No te preocupes, seguro que no es nada.");
    } else if ((p<=22)&&(11<=p)){
    System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else if ((p>=22)&&(p<=30)){
    System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    } 

  }
}
