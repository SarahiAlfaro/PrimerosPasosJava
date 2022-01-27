package operadores;

import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		//Operadores Aritm�ticos
		//+, -, /, *, %
		int a = 10;
		int b = 20;
		double c = 10.0;
		
		//Suma
		int suma = a + b;
		System.out.println(suma);
		
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + suma);
		
		//Resta
		System.out.println("El resultado de la resta es: " + (a - b));
		
		//Divisi�n
		int division = a / b;
		System.out.println("El resultado de la divisi�n es: " + division);
		
		//double division1 = (double) a/b;
		double division1 = c/b;
		//por lo menos uno de los datos debe ser de tipo double
		//10.0 / 20 = 0.5
		System.out.println("El resultado de la divisi�n es: " + division1);
		
		//Multiplicaci�n
		double multiplicacion = c*a;
		System.out.println("El resultado de la multiplicaci�n es: " + multiplicacion);
		
		//M�dulo
		double modulo = a % c;
		System.out.println("El m�dulo de la operaci�n es: " + modulo);
		
		/* Operador de asiganaci�n "=" */
		int d = 5, e; //inicializar las variables vac�as
		e = 6;
		System.out.println(d + "," + e);
		
		/*Operadores de declaraci�n compuesta*/
		/* +=, -=, *=, /=, %=  realizan una operaci�n simplificada */
		int f = 0, g = 5;
		f += 5;
		System.out.println(f);
		
		//Operadores relacionales
		/* <, >, <=, >= */
		/*
		 * == igualdad
		 * != diferencia
		 * Resultado de un valor de tipo boolean (true, false)
		*/
		int h = 15, i = 25;
		String j = "Hola";
		System.out.println(h > i); //false
		System.out.println(i != h);
		//System.out.println(h != j); //son valores distintos y no se pueden comparar
		
		//Operador unario
		/* ++, --
		 * preasiganci�n
		 * postasignaci�n
		*/
		int k=0, l=0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		//Precedencia de operadores
		int operacion = 4 + 5 * 6 / 3; //14
		System.out.println(operacion);
		
		int x = 0, y = 0;
		int operacion2 = ++x + y--;
		System.out.println(operacion2);//1;
		
		/* Operador ternario  */
		int edad = 18, valor1 = 0, valor2 =1;
		
		int resultado = (edad <= 18) ? (valor1=2) : (valor1=3);
		System.out.println(resultado);
		
		/*Operadores L�gicos
		 * And - &&
		 * Or - ||
		 * Not - !
		 */
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(true || false);//true
		System.out.println(true || !false);//true
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un n�mero");
		int num = sc.nextInt();
		System.out.println(num);
	}
}
