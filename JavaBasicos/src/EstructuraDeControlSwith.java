import java.util.Scanner;

public class EstructuraDeControlSwith {

	public static void main(String[] args) {
		/*
		switc(condiciona evaluar) {
		case "valor":
		//c�digo a ejecutar
		 //break
		 case "n"
		 //c�digo a ejecutar
		 //break
		 default:
		 //c�digo a ejecutar
		  }
		*/
		System.out.println("Introduce un d�a de la semana");
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();
		switch (dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un caf�");
			break;
		case "martes":
			System.out.println(""
					+ "lunes chiquito. Esto est� cansado, pero ya casi");
			break;
		case "miercoles":
			System.out.println("Mi�rcoles, pero a qu� cost?");
			break;
		case "jueves":
			System.out.println("Juevebes de sed peligrosa");
			break;
		case "viernes":
			System.out.println("Viernes de fiesta ");
			break;
		case "sabado":
		case "domingo":
			System.out.println("A descansar!");
			break;
		default:
			System.out.println("No es un d�a v�lido");
			break;
		}

	}

}
