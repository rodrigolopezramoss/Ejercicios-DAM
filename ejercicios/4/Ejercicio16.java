public class Ejercicio16{
  public static void main(String[] args){

    String linea;

    System.out.println("¿Te es fiel tu pareja? Responde sí o no.");


    System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    linea = System.console().readLine();
    double r1;
    r1 = Double.parseDouble( linea );

    System.out.println("Ha aumentado sus gastos de vestuario");
    linea = System.console().readLine();
    double r2;
    r2 = Double.parseDouble( linea );

    System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
    linea = System.console().readLine();
    double r3;
    r3 = Double.parseDouble( linea );

    System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    linea = System.console().readLine();
    double r4;
    r4 = Double.parseDouble( linea );

    System.out.println("No te deja que mires la agenda de su teléfono móvil");
    linea = System.console().readLine();
    double r5;
    r5 = Double.parseDouble( linea );

    System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    linea = System.console().readLine();
    double r6;
    r6 = Double.parseDouble( linea );

    System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    linea = System.console().readLine();
    double r7;
    r7 = Double.parseDouble( linea );

    System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    linea = System.console().readLine();
    double r8;
    r8 = Double.parseDouble( linea );

    System.out.println("Has notado que últimamente se perfuma más");
    linea = System.console().readLine();
    double r9;
    r9 = Double.parseDouble( linea );

    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    linea = System.console().readLine();
    double r10;
    r10 = Double.parseDouble( linea );
    
    int p= 0;
        
    if (r1==si){
     int p + 3;
    } else{
    
    }

    if (r2==si){
      p+3;
    } else{
      p + 0;
    }

    if (r3==si){
      p+3;
    } else{
      p + 0;
    }

    if (r4==si){
      p+3;
    } else{
      p + 0;
    }

    if (r5==si){
      p+3;
    } else{
      p + 0;
    }

    if (r6==si){
      p+3;
    } else{
      p + 0;
    }

    if (r7==si){
      p+3;
    } else{
      p + 0;
    }

    if (r8==si){
      p+3;
    } else{
      p + 0;
    }

    if (r9==si){
      p+3;
    } else{
      p + 0;
    }

    if (r10==si){
      p+3;
    } else{
      p + 0;
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
