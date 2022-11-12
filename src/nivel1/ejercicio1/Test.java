package nivel1.ejercicio1;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Cuerda sol = new Cuerda();
		
		Viento saxofon = new Viento();
		
		Percusion tambor = new Percusion();
		
		
		boolean bandera = true; 
		while(bandera) {
		System.out.println("Ingrese una opción: 1 para cuerda, 2 para viento y 3 para percusion");
		Scanner entrada=new Scanner(System.in);
		int opcion = entrada.nextInt();		
		
		switch(opcion) {
		case 1: sol.tocar();
		
		
		break;
		case 2: saxofon.tocar();
		
		break;
        case 3: tambor.tocar();
		
		break;
        case 4: bandera = false;
        System.out.println("El programa finaliza aquí");
		
		break;
		}
		}
	}
	
	
	

}
