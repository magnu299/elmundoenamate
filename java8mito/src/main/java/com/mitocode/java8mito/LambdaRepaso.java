package com.mitocode.java8mito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LambdaRepaso {

	private List<String> lista;

	public static void main(String[] args) {

		LambdaRepaso app = new LambdaRepaso();
		// app.restar();
		// app.listar();
		app.mapLambda();
	}

	public void mapLambda() {
		Map<Integer, String> mapeo = new HashMap<>();
		mapeo.put(1, "goku");
		mapeo.put(2, "bulma");
		mapeo.put(3, "freezer");

		// imprimir v7
		//  for (Map.Entry<Integer, String> e : mapeo.entrySet()) {
		for (Entry<Integer, String> e : mapeo.entrySet()) {
			System.out.println("La clave es: " + e.getKey() + " y el valor es " + e.getValue());
		}

		// imprimir v8

		mapeo.forEach((x, y) -> System.out.println("La clave es: " + x + " y el valor es " + y));
		
		mapeo.entrySet().stream().forEach(System.out::println);
		
		System.out.println(mapeo.get(1));
		
		//map.getOrDefault(k,v);
		
		String cadena = mapeo.getOrDefault(5, "valor por defecto");
		
		System.out.println(cadena);
		
		mapeo.entrySet().stream().forEach(System.out::println);
		
		//---------------------------------
		
		 mapeo.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  
	}

	public int restar() {
		int resul = 0;

		Operacion2 op = (x, y) -> {
			x = x + y;
			return x;
		};

		resul = op.calcular(10, 5);
		System.out.println(resul);

		return resul;
	}

	public void listar() {

		lista = new ArrayList<>();
		lista.add("coche 1");
		lista.add("camion 2");
		lista.add("coche 3");
		lista.add("nave 4");

		String[] juegos = { "fifa 19", "pes 19", "nba 2k19" };

		Arrays.sort(juegos, (p1, p2) -> p1.compareTo(p2));

		lista.sort((x, y) -> x.compareTo(y));

		lista.forEach(x -> System.out.println(x));

		System.out.println(Arrays.toString(juegos));

	}

}
