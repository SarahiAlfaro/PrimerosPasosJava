import java.util.Scanner;

public class Calculadora {
	/*
	   * Pedir al usuario 2 números por consola y preguntarle que desea realizar
	   * 1) Suma
	   * 2) Resta
	   * 3) División
	   * 4) Multiplicación
	   * 
	   * y despues imprimir el resultado
	   */

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer número");
		double n1 = sc.nextDouble();
		System.out.println("Ingresa el segundo número");
		double n2 = sc.nextDouble();
		System.out.println("Ingresa una opción: " + "\n" + "1) Suma" + "\n" + "2) Resta" + "\n" + "3) División" + "\n" + "4) Multiplicación");
		int opcion = sc.nextInt();
		double resultado;
		
		switch(opcion) {
		case 1:
			resultado = n1 + n2;
			System.out.println("El resultado de la suma es: " + resultado);
			break;
		case 2:
			resultado = n1 - n2;
			System.out.println("El resultado de la resta es: " + resultado);
			break;
		case 3:
			resultado = n1 / n2;
			System.out.println("El resultado de la división es: " + resultado);
			break;
		case 4:
			resultado = n1 * n2;
			System.out.println("El resultado de la multiplicación es: " + resultado);
			break;
		default:
			System.out.println("Opción no válida");
			
		}
		
		
			
	}
}
