package ejerciciosPoo;

public class Ejercicio03 {
  public static void main(String[] args) {
    Perro p01 = new Perro();
    Gato g01 = new Gato();
    Lagarto l01 = new Lagarto();
    Canario c01= new Canario();
    Pinguino pi01 = new Pinguino();
    
    p01.come();
    p01.come("hueso");
    System.out.println();
    
    g01.come();
    g01.come("pescado");
    System.out.println();
    
    c01.come("alpiste");
    c01.vuela();
    c01.come("bichitos");
    System.out.println();
    
    pi01.come("pescado");
    pi01.vuela();
    System.out.println();
    
    p01.juega("palo");
    System.out.println();
    
    l01.presume();
    
  }
}
