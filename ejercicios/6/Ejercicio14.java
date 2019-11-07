public class Ejercicio14{
  public static void main(String[]args){
  System.out.println("Piensa un número cualquiera del 0 al 100, la máquina intentara adivinarlo.");
  
  String res;
  
  int cont = 100;
  int cons = 0;
  for (int i = 1; i <=5; i++){
    int num =((int)(Math.random()*cont)+ cons);
    System.out.println("¿Es este tu número?(si/no)"+ num);
    res = System.console().readLine();
    
    
    if (res.equals("si")){
      System.out.println();
      System.out.println("1. Soy el mejor");
      System.out.println("2. Soy el mejor");
      System.out.println("3. Soy el mejor");
      break;
    }else if(res.equals("no")){
      System.out.println("¿Es mayor o menor?(mayor/menor)");
      res = System.console().readLine();
      
      if (res.equals("mayor")){
        cont = 100;
        cont -= num;
        cons = num;
      }else if(res.equals("menor")){
        cont = num;
        
      }else{
        break;
      }
      
    }else{
      break;
    }
    
  }
  
  }
}
