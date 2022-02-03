import java.util.Scanner;

public class Descuentos {

	public static void main(String[] args) {
		// solicitar el total de una compra por consola.
				// si la cuenta es de menos de 1000
				// sila cuenta es de 1001 - 4999 10%
				// si la cuenta es de 5001 a 9999 20%
				// si la copra es de 10000 o más 30%
		// imprimir el total con los descuentos incluidos
		Scanner compra = new Scanner(System.in);
		
		System.out.println("Ingrese el valor total de su compra ");
		double total = compra.nextDouble();
		double tdescuento = 0;
		if(total <= 0) {
			System.out.println("Compra no válida");
		} else if(total < 1000) {
			System.out.println("Su compra no aplica descuento");
		} else if ((total >= 1000) && (total <= 4999)) {
			tdescuento = (total * 0.9);
			System.out.println("Tiene un 10% de descuento!. Pagará " + tdescuento);
		} else if ((total >= 5000) && (total <= 9999)) {
			tdescuento = (total * 0.8);
			System.out.println("Tiene un 20% de descuento!. Pagará " + tdescuento);
		} else {
			tdescuento = (total * 0.7);
			System.out.println("Tiene un 30% de descuento!. Pagará " + tdescuento);
		} 
	}

}
