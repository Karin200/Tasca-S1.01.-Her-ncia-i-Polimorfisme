package nivel1.ejercicio1;

public abstract class Instrumento {

	static String nombre;
	static float precio;
	
	public Instrumento() {
			
	}
	/*{nombre = " ";
	precio = 0;}*/
	static {
		nombre = " ";
		precio = 0;	
	}
	public abstract  void tocar();
	
}
