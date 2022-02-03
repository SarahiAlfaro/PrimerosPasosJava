import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {

	public static void main(String[] args) {
		/* Las colecciones nos sirven para almacenar un 
		conjunto de objetos */
		/* La diferencia de las colecciones y los objetos,
		 * es que las colecciones son din�micas. Pueden
		 * cambiar el n�mero de objetos agregados */
		
		/*----------SET----------*/
		/*Set tiene 3 implementacionesz, no puede contener elementos repetidos,
		 * es la implementaci�n m�s r�pida */
		
		// HashSet, los elementos no mantienen un orden
		/*Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("pi�a");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		//foreach, recorre toda la colecci�n y en cada vuelta recupera un elemento 
		for (String fruta: frutas) {
			System.out.println(fruta);
		} */
		
		//TreeSet
		//Esta implementaci�n ordena los elementos
		//de sus valores, es la implementaci�n m�s lenta
		//Set<String> frutas = new TreeSet<String>();
		//frutas.add("mango");
		//frutas.add("granada");
		//frutas.add("pi�a");
		//frutas.add("sandia");
		//frutas.add("mamey");
		//frutas.add("fresa");
		
		/* foreach, recorre toda la colecci�n y en cada vuelta recupera un elemento */
		//for (String fruta: frutas) {
			//System.out.println(fruta);
		//}
		
		//LinkedHashSet
		//Ordena los elementos en orden de inserci�n
		//es m�s costoso que HashSet
		/*Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("pi�a");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");*/
		
		/* foreach, recorre toda la colecci�n y en cada vuelta recupera un elemento */
		/*for (String fruta: frutas) {
			System.out.println(fruta);
		}*/
		
		/*----------LIST----------*/
		//Se permiten elementos duplicados, podemos acceder a elementos espec�ficos
		//Podemos buscar elementos
				
		//ArrayList
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("chicorita");
		pokemones.add("Eevee");
		pokemones.add("Psyduck");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		pokemones.add(2, "Pikachu"); //agrega un elemento en la posici�n 2 sin remplazar, sino desplazando
		pokemones.add("Gengar");
		
		//remove, elimina el elemento de la posici�n seleccionada
		pokemones.remove(5);
		
		//set reemplaza el elemnto el la posici�n especificada
		pokemones.set(0, "Flareon");
				
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("***************");
		System.out.println(pokemones.get(0));//devuelve el elemento que est� en la posici�n 0
		
		//indexOf, nos devuelve la posici�n del elemento
		//y si el elemento no se encuentra nos devuelve -1
		//lastIndexof, regresa la posici�n del �ltimo elemento
		System.out.println(pokemones.indexOf("Gengar"));
		System.out.println(pokemones.lastIndexOf("Gengar"));
			
		//LinkedList
		//Es una lista doblemente enlazada
		//Es m�s r�pido agregar y eliminar elementos
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		digimones.add("Agumon");
		
		/*----------MAP/----------*/
		//Asocia claves a valores
		//No puede contener claves duplicadas
		//S�lo puede tener un valor asociado
		
		//HashMap
		//Tiene mejor rendimiento pero no garantiza un orden
		//a la hora de hacer iteraciones
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1123, "Carlos Eduardo");
		usuarios.put(2426, "Ra�l");
		usuarios.put(3896, "Ro");
		System.out.println("***************");
		System.out.println(usuarios.get(1123));
		
		System.out.println(usuarios.keySet());//keySt nos permite recuperar los nombres de las claves
		System.out.println(usuarios.values());//values nos permite recuperar el valor directamente
		
		//TreeMap
		Map<String, String> tamales = new TreeMap<String, String>();
		tamales.put("Oaxaque�o", "Mole Rojo");
		tamales.put("Torta", "Mole Verde");
		tamales.put("Dulces", "Gansito");
		tamales.put("Salado", "Cochinita");
		System.out.println("***************");
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		System.out.println(tamales);
		
		tamales.entrySet().forEach(clave -> {
			//System.out.println(clave.getKey().toString() + clave.getValue().toString());
			//System.out.println(clave);
			System.out.println(clave.getKey());
			System.out.println(clave.getValue());
		});

		
		//LinkedHashMap
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		carros.put(1, "Volvo");
		carros.put(567, "Pointer");
		carros.put(8, "Mustang");
		System.out.println("***************");
		System.out.println(carros.keySet());
		System.out.println(carros.values());
	}

}
