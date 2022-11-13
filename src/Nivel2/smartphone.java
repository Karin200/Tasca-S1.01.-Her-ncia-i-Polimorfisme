package Nivel2;

public class smartphone extends Telefono implements camara, Reloj{

	@Override
	public void fotografiar() {
		System.out.println("Se está haciendo una foto");
		
	}
	
	
	@Override
	public void alarma() {
		System.out.println("Está sonando la alarma");
	}

}
