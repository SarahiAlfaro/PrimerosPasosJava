
public class ManipularArreglo {

	public static void main(String[] args) {
		/*
		Crea una clase llamara ManipularArreglo
		crea un array con los siguientes números enteros:
		1, 6, 45, 53, 80, 102, 145, 326, 450, 892
		Crea un programa que use un ciclo que tome los números de arreglo y devuelva la suma total, la suma de los números pares y la suma de los números impares.
		*/
		int []numeros = new int[]{1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int i=0, sumat=0, sumai=0, sumap=0;
		while(i < numeros.length) {
			if((numeros[i] % 2) == 0) {
				System.out.println(numeros[i] + " Es par");
				sumap = sumap + numeros[i];
			} else {
				System.out.println(numeros[i] + " Es impar");
				sumai = sumai + numeros[i];
			}
			sumat = sumat + numeros[i];
			i++;
		}
		
		System.out.println("La suma total de todos los elementos es: " + sumat);
		System.out.println("La suma de todos los elementos pares es: " + sumap);
		System.out.println("La suma total de los elementos impares es: " + sumai);
	}

}
