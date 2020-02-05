package ejercicio11;

public class TarjetaRegalo {
	
   
   double saldo;
   
   public TarjetaRegalo(int dinero) {
	   this.saldo = dinero;
   }
  
   public void gasta(double gasto) {
	   if (this.saldo < gasto) {
		 System.out.println("No hay suficiente dinero como para gastar " + gasto + "€");
	   }else {
	     this.saldo -= gasto;
	   }
   }
   

	public String toString() {
		
		return "Saldo: " + this.saldo + "€" ;
	
	}

	public TarjetaRegalo fusionaCon(TarjetaRegalo tarjeta) {
		tarjeta.saldo += this.saldo;
		return tarjeta;
		
	}
}
