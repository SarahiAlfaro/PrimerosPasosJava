import java.util.Scanner;
public class Tabla {

	public static void main(String[] args) {
		//Utilizando un bucle while
		//1.- Crea una nueva clase llamada Tabla
		//2.- Copia el siguiente codigo y verifica que funcione
		//Implementa un bucle while que imprima el resultado
		//3.- Debe imprimir la tabla de multiplicar del n�mero en cuesti�n (solo los primeros 10 n�meros)
        
		Scanner console = new Scanner(System.in);
		int num, control=0, resultado;
				        
		System.out.print("Ingresa cualquier n�mero positivo: ");
		num = console.nextInt();
		System.out.println("Tabla de multiplicar de  " + num);
		while(control<=10) {
			resultado = num*control;
			System.out.println( num + " * " + control + " = " + resultado);
			control++;
		}
		   
	}

}
