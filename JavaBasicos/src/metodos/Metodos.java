package metodos;

public class Metodos {
	//M�todo es una funci�n
	
	//atributos de la clase
	int a, b;
	
	//M�todo void(vacio)
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + " mas " + b + " es " + resultado);
	}
	
	//M�todo con retorno de valores
	public int sumaConRetorno() {
		//int resultado = a + b;
		//return resultado;
		return a + b;
	}
	
	//Argumentos
	//sumar(argumentos)
	public int multiplicarConArgumentos(int arg1, int arg2) {
		return arg1 * arg2;
	}
	
	//M�todo est�tico 
	//que sea estatico signidfica que no requiere de un objeto
	//puede ser void o retornar algo
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre);
	}
}
