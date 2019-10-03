public class Ejercicio08 {
  public static void main(String[] args){
    
    String linea;
    
    System.out.println("Calculemos la media de tres notas");
   
    System.out.print("Introduce la primera nota: ");    
    linea = System.console().readLine();
    double a;
    a = Double.parseDouble( linea );

    System.out.print("Introduce la segunda nota: ");    
    linea = System.console().readLine();
    double b;
    b = Double.parseDouble( linea );

    System.out.print("Introduce la tercera nota: ");    
    linea = System.console().readLine();
    double c;
    c = Double.parseDouble( linea );

    double m =(a+b+c)/3;

    if ((m >= 5)&&(m<=10)){
		System.out.println("Aprovado con un "+m);
	    }
	else {
		System.out.println("Suspendido con un "+m);		
	    }
    
    if (m <5){
		System.out.println("Insuficiente.");		
	
	    }
    else if ((m==5)){
		System.out.println("Suficiente.");
		
		}
    else if ((m>=6)&&(m<8)){
		System.out.println("Bien.");
		
		}
    else if ((m>=8)&&(m<10)){
		System.out.println("Notable.");
		
		}
    else if (m==10){
		System.out.println("Sobresaliente.");
		
		}
                
    
    
  }
}
