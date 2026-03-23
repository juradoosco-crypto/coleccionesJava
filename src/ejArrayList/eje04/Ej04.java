package ejArrayList.eje04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class Ej04 {
	public static void main(String[] args) {
		Random rd = new Random();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int tamaño = rd.nextInt(20);
		
		for (int i = 0; i < tamaño; i++) {
			lista.add(rd.nextInt(101));
		}
		
		System.out.println("Lista original "+lista);
		Collections.sort(lista);
		System.out.println("Lista ordenada "+lista);
		
		TreeSet<Integer> set = new TreeSet<Integer>(lista);
		System.out.println("Contenido del treeset sin repetidos y ordenado: "+set);
		System.out.println("Elementos eliminados por ser repetidos "+(lista.size() - set.size()));
	}

}
