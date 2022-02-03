
public class Ciclos {
	public static void main (String[] args) {
		//While
		int control = 0;
		 //while(control<10) {
			//System.out.println("Control = " + control);
			//control++;
		//}
		
		//do while
		do {
			//código a ejecutar
			System.out.println("Control = " + control);
			//modificador de la variable control
			control++;
		} while(control < 3);
		
		//for
		for(int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue; //permite saltarnos una ejecución del cliclo
				//deja que continúe el ciclo
			}
			
	}
	}
}
