import java.util.Scanner;

public class DeletreaNombre {

	public static void main(String[] args) {
		/*Escribe un programa que pida al usuario ingresar su nombre y que entonces imprima cada una de las letras de su nombre.
		Ejemplo: "Juan"
		"J"
		"u"
		"a"
		"n"
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre");
		String nombre = sc.nextLine();
		sc.close();
		int control = 0;
		while(control < nombre.length()) {
			System.out.println(nombre.charAt(control));
			control++;
		}
	}

}
