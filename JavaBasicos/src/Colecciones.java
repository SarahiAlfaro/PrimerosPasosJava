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
		 * es que las colecciones son dinámicas. Pueden
		 * cambiar el número de objetos agregados */
		
		/*----------SET----------*/
		/*Set tiene 3 implementacionesz, no puede contener elementos repetidos,
		 * es la implementación más rápida */
		
		// HashSet, los elementos no mantienen un orden
		/*Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		//foreach, recorre toda la colección y en cada vuelta recupera un elemento 
		for (String fruta: frutas) {
			System.out.println(fruta);
		} */
		
		//TreeSet
		//Esta implementación ordena los elementos
		//de sus valores, es la implementación más lenta
		//Set<String> frutas = new TreeSet<String>();
		//frutas.add("mango");
		//frutas.add("granada");
		//frutas.add("piña");
		//frutas.add("sandia");
		//frutas.add("mamey");
		//frutas.add("fresa");
		
		/* foreach, recorre toda la colección y en cada vuelta recupera un elemento */
		//for (String fruta: frutas) {
			//System.out.println(fruta);
		//}
		
		//LinkedHashSet
		//Ordena los elementos en orden de inserción
		//es más costoso que HashSet
		/*Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");*/
		
		/* foreach, recorre toda la colección y en cada vuelta recupera un elemento */
		/*for (String fruta: frutas) {
			System.out.println(fruta);
		}*/
		
		/*----------LIST----------*/
		//Se permiten elementos duplicados, podemos acceder a elementos específicos
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
		pokemones.add(2, "Pikachu"); //agrega un elemento en la posición 2 sin remplazar, sino desplazando
		pokemones.add("Gengar");
		
		//remove, elimina el elemento de la posición seleccionada
		pokemones.remove(5);
		
		//set reemplaza el elemnto el la posición especificada
		pokemones.set(0, "Flareon");
				
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("***************");
		System.out.println(pokemones.get(0));//devuelve el elemento que está en la posición 0
		
		//indexOf, nos devuelve la posición del elemento
		//y si el elemento no se encuentra nos devuelve -1
		//lastIndexof, regresa la posición del último elemento
		System.out.println(pokemones.indexOf("Gengar"));
		System.out.println(pokemones.lastIndexOf("Gengar"));
			
		//LinkedList
		//Es una lista doblemente enlazada
		//Es más rápido agregar y eliminar elementos
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
		//Sólo puede tener un valor asociado
		
		//HashMap
		//Tiene mejor rendimiento pero no garantiza un orden
		//a la hora de hacer iteraciones
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1123, "Carlos Eduardo");
		usuarios.put(2426, "Raúl");
		usuarios.put(3896, "Ro");
		System.out.println("***************");
		System.out.println(usuarios.get(1123));
		
		System.out.println(usuarios.keySet());//keySt nos permite recuperar los nombres de las claves
		System.out.println(usuarios.values());//values nos permite recuperar el valor directamente
		
		//TreeMap
		Map<String, String> tamales = new TreeMap<String, String>();
		tamales.put("Oaxaqueño", "Mole Rojo");
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
