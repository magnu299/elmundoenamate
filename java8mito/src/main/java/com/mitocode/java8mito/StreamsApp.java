package com.mitocode.java8mito;

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {

	private List<String> lista;
	private List<String> numeros;

	public static void main(String[] args) {

		StreamsApp app = new StreamsApp();
		// app.filtar();
		// app.ordenar();
	//	app.transformar();
		app.contar();
		app.limitar();
		System.out.println("AN DALUCIA");
	}

	public StreamsApp() {

		lista = new ArrayList<>();
		lista.add("coche 1");
		lista.add("camion 2");
		lista.add("coche 3");
		lista.add("nave 4");

		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
		numeros.add("5");
		numeros.add("6");
	}

	public void filtar() {

		lista.stream().filter(x -> x.startsWith("n")).forEach(System.out::println);

		// lista.stream().filter(x->x.startsWith("c")).forEach(x->System.out.println(x));
	}

	public void transformar() {

		// lista.stream().map(String::toUpperCase).forEach(System.out::println);

		numeros.stream().map(x -> Integer.parseInt(x)).forEach(System.out::println);
	}

	public void ordenar() {

		// lista.stream().sorted().forEach(System.out::println);
		lista.stream().sorted((x, y) -> x.compareTo(y)).forEach(System.out::println);
	}

	public void contar() {
		long cuenta  = lista.stream().count();
		System.out.println(cuenta);
	}

	public void limitar() {
		lista.stream().limit(2).forEach(System.out::println);
	}

}
