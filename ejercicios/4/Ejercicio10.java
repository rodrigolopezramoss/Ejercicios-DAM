public class Ejercicio10 {
  public static void main(String[] args){
    
    String linea;
    
    System.out.println("Averigüemos tu horóscopo");

    System.out.print("Dime el mes que naciste del 1 al 12: ");    
    linea = System.console().readLine();
    int mes;
    mes = Integer.parseInt( linea );

    System.out.print("Dime ahora el día que naciste: ");    
    linea = System.console().readLine();
    int dia;
    dia = Integer.parseInt( linea );
    
    int enero =1;
    int febrero;
    int marzo;
    
    
    switch(mes){
      case 1:
        if ((dia>=1)&&(dia<=20)){
          System.out.println("Eres Capricornio.");
        
        } else if ((dia>=21)&&(dia<=31)){
          System.out.println("Eres Acuario.");       
        }
      break;
      case 2:
        if ((dia>=1)&&(dia<=19)){
          System.out.println("Eres Acuario.");
        
        } else if ((dia>=20)&&(dia<=29)){
          System.out.println("Eres Piscis.");       
        }      
      break;      
      case 3:
        if ((dia>=1)&&(dia<=20)){
          System.out.println("Eres Piscis.");
        
        } else if ((dia>=21)&&(dia<=31)){
          System.out.println("Eres Aries.");       
        }      
      break;
      case 4:
        if ((dia>=1)&&(dia<=20)){
          System.out.println("Eres Aries.");
        
        } else if ((dia>=21)&&(dia<=30)){
          System.out.println("Eres Tauro.");       
        }      
      break;    
      case 5:
        if ((dia>=1)&&(dia<=20)){
          System.out.println("Eres Tauro.");
        
        } else if ((dia>=21)&&(dia<=31)){
          System.out.println("Eres Géminis.");       
        }      
      break;    
      case 6:
        if ((dia>=1)&&(dia<=21)){
          System.out.println("Eres Géminis.");
        
        } else if ((dia>=22)&&(dia<=30)){
          System.out.println("Eres Cáncer.");       
        }
      break;    
      case 7:
        if ((dia>=1)&&(dia<=22)){
          System.out.println("Eres Cáncer.");
        
        } else if ((dia>=23)&&(dia<=31)){
          System.out.println("Eres Leo.");       
        }
      break;    
      case 8:
        if ((dia>=1)&&(dia<=23)){
          System.out.println("Eres Leo.");
        
        } else if ((dia>=24)&&(dia<=31)){
          System.out.println("Eres Virgo.");       
        }
      break;    
      case 9:
        if ((dia>=1)&&(dia<=22)){
          System.out.println("Eres Virgo.");
        
        } else if ((dia>=23)&&(dia<=30)){
          System.out.println("Eres Libra.");       
        }
      break;    
      case 10:
        if ((dia>=1)&&(dia<=23)){
          System.out.println("Eres Libra.");
        
        } else if ((dia>=24)&&(dia<=31)){
          System.out.println("Eres Escorpio.");       
        }
      break;    
      case 11:
        if ((dia>=1)&&(dia<=22)){
          System.out.println("Eres Escorpio.");
        
        } else if ((dia>=23)&&(dia<=30)){
          System.out.println("Eres Sagitario.");       
        }
      break;    
      case 12:
        if ((dia>=1)&&(dia<=22)){
          System.out.println("Eres Sagitario.");
        
        } else if ((dia>=23)&&(dia<=31)){
          System.out.println("Eres Capricornio.");       
        }
      break;    

       
    }
    
    
  }
}
