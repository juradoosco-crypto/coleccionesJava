package ejHashMap.eje03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MiniDiccionario {
	public static void main(String[] args) {
		var diccionario = new HashMap <String,String>();
		Scanner sc = new Scanner(System.in);
		
		// 10 Palabra
		diccionario.put("hola", "hello");
		diccionario.put("mesa", "table");
		diccionario.put("azul", "blue");
		diccionario.put("ordenador", "computer");
		diccionario.put("leer", "read");
		diccionario.put("escribir", "write");
		diccionario.put("tamaño", "size");
		diccionario.put("pantalla", "screen");
		diccionario.put("blanco", "white");
		diccionario.put("arbol", "tree");
		
		ArrayList <String>seleccionadas = obtenerPalabras(diccionario,10);
		
		int puntos=0;
		for (String palabra: seleccionadas) {
			System.out.println("Palabra en español: "+palabra);
			System.out.println("Palabra en inglés: ");
			String palabraUsuario = sc.nextLine();
			if (diccionario.get(palabra).equals(palabraUsuario)) {
				System.out.println("Respuesta correcta");
				puntos++;
			} else {
				System.out.println("Respuesta incorrecta");
			}
		}
		System.out.println("Total de puntos = "+puntos);
	}
	
	private static ArrayList<String> obtenerPalabras(HashMap<String, String> diccionario, int numPalabra){
		var listaEspañol = new ArrayList <String>(diccionario.keySet());
		var listaSeleccionada = new ArrayList <String>();
		var rd = new Random();
		for (int i = 1; i <= numPalabra; i++) {
			boolean nueva = false;
			do {
				int posicion = rd.nextInt(listaEspañol.size());
				String palabra = listaEspañol.get(posicion);
				if (!listaSeleccionada.contains(palabra)) {
					listaSeleccionada.add(palabra);
					nueva = true;
				}
			} while(!nueva);
		}
		return listaSeleccionada;
	}
	
	private static ArrayList<String> obtenerPalabras2(HashMap<String, String> diccionario, int numPalabra){
		List <String> resu = new ArrayList<String>(diccionario.keySet());
		//Barajeo
		Collections.shuffle(resu);
		resu = resu.subList(0, numPalabra);
		return new ArrayList<String>(resu);
	}
}
