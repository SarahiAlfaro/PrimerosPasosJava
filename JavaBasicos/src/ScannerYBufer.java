import java.util.Scanner;

public class ScannerYBufer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		
		/*System.out.println("Introduce otro número");
		int numero2 = sc.nextInt();*/
		
		System.out.println("Introduce un número");
		int numero1 = sc.nextInt();
		sc.nextLine(); //esta líena limpia el bufer
	
		sc.close();
		
		System.out.println("Tu nombre es: " + nombre 
				+ " . Tu número es: " + numero1);
		
	}

}
