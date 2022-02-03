
public class Arreglos {

	public static void main(String[] args) {
		// Solo un tipo de dato
		//especificar el tamaño o la cantidad de elementos que va a contener
		
		// Manera 1
		int numeros[]; //creamos la variable
		numeros = new int[4]; //creamos el arreglo
		
		//Manera 2
		String[] nombres = new String[4];//basado en [0, 1, 2, 3]
		
		//Manera 3
		//array literal
		String []nombreFrutas = new String[]{"Manzana", "Plátano", "Uva", "Pera"};
				
		numeros[0]=10;
		numeros[1]=8;
		numeros[2]=100;
		numeros[3]=200;
		
		nombres[0]="Juan";
		nombres[1]="Pedro";
		nombres[2]="Antonio";
		nombres[3]="Felipe";
		
		for(int i=0; i < numeros.length; i++) { //en un arrgle length es una propiedad, por lo que no se ponen paréntesis.
			System.out.println(numeros[i]);
			System.out.println(nombres[i]);
			System.out.println(nombreFrutas[i]);
			System.out.println("---------------");
		}
		
	}

}
