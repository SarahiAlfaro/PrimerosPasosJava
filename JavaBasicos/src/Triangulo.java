import java.util.Scanner;

public class Triangulo {
	public static void main(String [] args) {
		Scanner angulo = new Scanner(System.in);
		
		System.out.printf( "Introduzca el primer �ngulo: " );
		int n1 = angulo.nextInt();
		System.out.printf( "Introduzca un segundo �ngulo: " );
		int n2 = angulo.nextInt();
		System.out.printf( "Introduzca un tercer �ngulo: " );
		int n3 = angulo.nextInt();
		int suma = n1+n2+n3;
		
		if(suma == 180) {
			System.out.println("Es un tri�ngulo");
		} else {
			System.out.println("No es un tri�ngulo");
		}
	}
}
