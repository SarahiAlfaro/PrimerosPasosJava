import java.util.Scanner;

public class EstructuraDeControlSwith {

	public static void main(String[] args) {
		/*
		switc(condiciona evaluar) {
		case "valor":
		//código a ejecutar
		 //break
		 case "n"
		 //código a ejecutar
		 //break
		 default:
		 //código a ejecutar
		  }
		*/
		System.out.println("Introduce un día de la semana");
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();
		switch (dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un café");
			break;
		case "martes":
			System.out.println(""
					+ "lunes chiquito. Esto está cansado, pero ya casi");
			break;
		case "miercoles":
			System.out.println("Miércoles, pero a qué cost?");
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
			System.out.println("No es un día válido");
			break;
		}

	}

}
