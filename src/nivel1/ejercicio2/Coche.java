package nivel1.ejercicio2;

public class Coche {
	public static final String marca = "Toyota";
	public static String modelo = "B2";
	public final double potencia = 2000;
	
   public Coche(String modelo){
	   this.modelo = modelo;
	    
   }
   public Coche() {
	   
   }
   public static void frenar() {
	   System.out.println("El vehículo está frenando");
	   
   }
   
   public void acelerar () {
	   System.out.println("El vehículo está acelerando");
   }
}
