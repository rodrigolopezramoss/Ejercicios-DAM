public class Ejercicio03{
  public static void main(String[]args){
  System.out.println("Baraja española, que es mejor.");
  

  
  for (int i = 1; i <= 1; i++) {
    int bar =((int)(Math.random()*4 + 1));
    switch(bar){
      case 1:
        int espa =((int)(Math.random()*10 + 1));
        switch (espa){
          case 1:
            System.out.println("As de espadas.");
          break;
          case 8:
            System.out.println("Sota de espadas.");
          break;
          case 9:
            System.out.println("Caballo de espadas.");
          break;
          case 10:
            System.out.println("Rey de espadas.");
          break;
          default:
            System.out.println(espa + " de espadas.");
        }
      break;
      case 2:
        int oros =((int)(Math.random()*10 + 1));
        switch (oros){
          case 1:
            System.out.println("As de oros.");
          break;
          case 8:
            System.out.println("Sota de oros.");
          break;
          case 9:
            System.out.println("Caballo de oros.");
          break;
          case 10:
            System.out.println("Rey de oros.");
          break;
          default:
            System.out.println(oros + " de oros.");
        }
      break;
      case 3:
        int copas =((int)(Math.random()*10 + 1));
        switch (copas){
          case 1:
            System.out.println("As de copas.");
          break;
          case 8:
            System.out.println("Sota de copas.");
          break;
          case 9:
            System.out.println("Caballo de copas.");
          break;
          case 10:
            System.out.println("Rey de copas.");
          break;
          default:
            System.out.println(copas + " de copas.");
        }
      break;
      case 4:
        int bastos =((int)(Math.random()*10 + 1));
        switch (bastos){
          case 1:
            System.out.println("As de bastos.");
          break;
          case 8:
            System.out.println("Sota de bastos.");
          break;
          case 9:
            System.out.println("Caballo de bastos.");
          break;
          case 10:
            System.out.println("Rey de bastos.");
          break;
          default:
            System.out.println(bastos + " de bastos.");
        }
      break;
    }
  }
  
  }
}
