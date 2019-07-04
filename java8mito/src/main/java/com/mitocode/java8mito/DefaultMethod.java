package com.mitocode.java8mito;

import java.util.Arrays;

public class DefaultMethod implements PersonaA {

	public static void main(String[] args) {

		DefaultMethod app = new DefaultMethod();

		app.hablar();
		app.refeMetodInstanciaObjArbi();
		app.crearPerso();

	}

	@Override
	public void caminar() {

	}

	public void crearPerso() {
		// Ipersona per = (x, y) -> new Persona(x, y);

		Ipersona per = Persona::new;

		Persona perso = per.crear(1, "goku");

		System.out.println(perso.getId() + perso.getNombre());
	}

	public void refeMetodInstanciaObjArbi() {
		String[] lista = { "Mitocode", "pepe", "Juan" };

		// Arrays.sort(lista,(s1,s2)->s1.compareToIgnoreCase(s2));

		Arrays.sort(lista, String::compareToIgnoreCase);

		System.out.println(Arrays.toString(lista));

	}

}
