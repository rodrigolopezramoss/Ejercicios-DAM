public class Ejercicio12{
  public static void main(String[] args){

    String linea;

    System.out.println("¿Listo para una serie de preguntas?");

    System.out.println("1.¿Cuántas asignaturas tienes?");
    System.out.println("1) 2");
    System.out.println("2) 5");
    System.out.println("3) 6");
    linea = System.console().readLine();
    double r1;
    r1 = Double.parseDouble( linea );

    System.out.println("2.¿En qué lenguaje programas en LM para el desarrollo de páginas web?");
    System.out.println("1) Java");
    System.out.println("2) HTML");
    System.out.println("3) Covol");
    linea = System.console().readLine();
    double r2;
    r2 = Double.parseDouble( linea );

    System.out.println("3.¿Enque asignatura usas Mysql?");
    System.out.println("1) PROG");
    System.out.println("2) BBDD");
    System.out.println("3) EDD");
    linea = System.console().readLine();
    double r3;
    r3 = Double.parseDouble( linea );

    System.out.println("4.¿En el terminal, como compilas Java?");
    System.out.println("1) javac ejemplodeejercicio.java");
    System.out.println("2) java ejemplodeejercicio.java");
    System.out.println("3) java ejemplodeejercicio");
    linea = System.console().readLine();
    double r4;
    r4 = Double.parseDouble( linea );

    System.out.println("5.¿Cuántas asignaturas da la maestra Pilar?");
    System.out.println("1) 1");
    System.out.println("2) 5");
    System.out.println("3) 2");
    linea = System.console().readLine();
    double r5;
    r5 = Double.parseDouble( linea );

    System.out.println("6.¿Quién nos enseña git y Java?");
    System.out.println("1) Luis");
    System.out.println("2) Pilar");
    System.out.println("3) Paqui");
    linea = System.console().readLine();
    double r6;
    r6 = Double.parseDouble( linea );

    System.out.println("7.En BBDD, ¿Qué va antes?");
    System.out.println("1) Diseño físico");
    System.out.println("2) Diseño conceptual");
    linea = System.console().readLine();
    double r7;
    r7 = Double.parseDouble( linea );

    System.out.println("8.¿Cuál de estas NO es un tipo de correspondencia?");
    System.out.println("1) Por carta");
    System.out.println("2) 1 a 1");
    System.out.println("3) m a n");
    linea = System.console().readLine();
    double r8;
    r8 = Double.parseDouble( linea );

    System.out.println("9.¿En que formato, en visual code, se escribe el estilo en un archivo aparte?");
    System.out.println("1) html");
    System.out.println("2) CSS");
    System.out.println("3) Gótico");
    linea = System.console().readLine();
    double r9;
    r9 = Double.parseDouble( linea );

    System.out.println("10.¿Cuál es el mejor maestro?");
    System.out.println("1) Luis José");
    System.out.println("2) Luis José");
    System.out.println("3) Luis José");
    linea = System.console().readLine();
    double r10;
    r10 = Double.parseDouble( linea );
    
    int p= 0;
        
    if (r1==3){
      p++;
    } else{
     System.out.println("Mal la primera respuesta");
    }

    if (r2==2){
      p++;
    } else{
     System.out.println("Mal la segunda respuesta");
    }
    
    if (r3==2){
      p++;
    } else{
     System.out.println("Mal la tercera respuesta");
    }

    if (r4==1){
      p++;
    } else{
     System.out.println("Mal la cuarta respuesta");
    }

    if (r5==3){
      p++;
    } else{
     System.out.println("Mal la quinta respuesta");
    }

    if (r6==1){
      p++;
    } else{
     System.out.println("Mal la sexta respuesta");
    }

    if (r7==2){
      p++;
    } else{
     System.out.println("Mal la séptima respuesta");
    }

    if (r8==1){
      p++;
    } else{
     System.out.println("Mal la octava respuesta");
    }

    if (r9==2){
      p++;
    } else{
     System.out.println("Mal la novena respuesta");
    }

    if ((r10==1)||(r10==2)||(r10==3)){
      p++;
    } else{
     System.out.println("Mal la décima respuesta");
    }

    System.out.println("Tu puntuación: "+ p);

  }
}
