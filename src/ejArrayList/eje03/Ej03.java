package ejArrayList.eje03;

import java.util.ArrayList;
import java.util.Random;

public class Ej03 {
	public static void main(String[] args) {
		Random rd = new Random();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int tamaño = rd.nextInt(11) + 10;
		
		for (int i = 0; i < tamaño; i++) {
			lista.add(rd.nextInt(101));
		}
		System.out.println("Lista "+lista);
		
		int suma = 0;
		for (int numero : lista) {
			suma += numero;
		}
		System.out.println("La suma es "+suma);
		
		lista.removeIf(x -> x % 2 == 0);
		System.out.println("Lista de números impares "+lista);
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % 3 == 0) {
				lista.set(i, 0);
			}
		}
		System.out.println("Lista con números divisibles por 3 "+lista);
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) != 0 && lista.get(i) % 5 == 0) {
				lista.add(i, 555);
				i++;
			}
		}
		System.out.println("Lista con números divisibles por 5 "+lista);
	}
}
