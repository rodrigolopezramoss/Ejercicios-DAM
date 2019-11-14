public class Ejercicio03{
  public static void main(String[]args){
  System.out.println("Dame 10 números y te los invierto.");
  
  String res;
  
 
 
  
  int[] num = new int[10];
  
  System.out.println("Dame los números.");
  for(int i = 9; i >= 0; i--){
    res = System.console().readLine();
    int x;
    x = Integer.parseInt(res);
    
    num[i] = x;
  }
  
  System.out.println("He aquí los números en orden inverso:");
  for(int i =0; i <= 9;i++){
    System.out.println(num[i]);
  }
  
  }
}
