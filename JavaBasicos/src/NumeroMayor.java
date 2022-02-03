import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		System.out.printf( "Introduzca un número entero: " );
		Scanner num1 = new Scanner(System.in);
		int n1 = num1.nextInt();
		System.out.printf( "Introduzca un número entero: " );
		Scanner num2 = new Scanner(System.in);
		int n2 = num2.nextInt();
		System.out.printf( "Introduzca un número entero: " );
		Scanner num3 = new Scanner(System.in);
		int n3 = num3.nextInt();
		
		/*if(n1 > n2) {
			if (n1 > n3) {
				System.out.println("El numero mayor es: " + n1);
			} else {
				System.out.println("El número mayor es: " + n3);
			}
		} else if(n2 > n3 ){
			System.out.println("El numero mayor es: " + n2);
		} else {
			System.out.println("El número mayor es: " + n3);
		}*/
		/*Probar 
		1 4 4
		4 1 4
		4 4 1
		5 4 4
		*/
		
		if(n1 > n2) {
			if (n1 > n3) {
				System.out.println("El numero mayor es: " + n1);
			} else if (n1 == n3) {
				System.out.println("El número mayor es: " + n1);
			} else {
				System.out.println("El número mayor es: " + n3);
			}
		} else if((n2 > n3 ) || (n2 == n3)){
			System.out.println("El numero mayor es: " + n2);
		} else if(n1 == n2) {
			if(n1 > n3) {
				System.out.println("El número mayor es: " + n1);
			} else {
				System.out.println("El número mayor es: " + n3);
			}
			
		} else {
			System.out.println("El número mayor es: " + n3);
		}
	}

}
