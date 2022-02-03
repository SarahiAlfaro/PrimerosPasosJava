import java.util.Scanner;

public class Triangulo {
	public static void main(String [] args) {
		Scanner angulo = new Scanner(System.in);
		
		System.out.printf( "Introduzca el primer ángulo: " );
		int n1 = angulo.nextInt();
		System.out.printf( "Introduzca un segundo ángulo: " );
		int n2 = angulo.nextInt();
		System.out.printf( "Introduzca un tercer ángulo: " );
		int n3 = angulo.nextInt();
		int suma = n1+n2+n3;
		
		if(suma == 180) {
			System.out.println("Es un triángulo");
		} else {
			System.out.println("No es un triángulo");
		}
	}
}
