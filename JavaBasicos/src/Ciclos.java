
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
			//c�digo a ejecutar
			System.out.println("Control = " + control);
			//modificador de la variable control
			control++;
		} while(control < 3);
		
		//for
		for(int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue; //permite saltarnos una ejecuci�n del cliclo
				//deja que contin�e el ciclo
			}
			
	}
	}
}
