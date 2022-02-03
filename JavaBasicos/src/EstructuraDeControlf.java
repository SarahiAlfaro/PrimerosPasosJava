import java.util.Scanner;

public class EstructuraDeControlf {
	// Estructura de control de flujo
	//Nos sirve para la toma de decisiones
	
	//Estructuras de control de flujo nos sirven
	//para cambiar el flujo de nuestro programa
	//evaluando una condición y a partir de la evaluacion
	//se realiza una acción u otra.
	public static void main(String[] args) {
		/*
		if(condicion) {
			codigo
		} else {
			codigo
		}
		*/
		//System.out.println("mensaje");
		Scanner scanner = new Scanner(System.in);
		int edad = scanner.nextInt();
		
		if(edad >= 18) {
			System.out.println("Eres mayo de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
			
	}

}
