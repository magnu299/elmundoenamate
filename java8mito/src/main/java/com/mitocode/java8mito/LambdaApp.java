package com.mitocode.java8mito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class LambdaApp 
{
    public static void main( String[] args )
    {
    	LambdaApp app = new LambdaApp();
    	app.ordenar();
    //	app.multiplicar();
    }
    
    public void ordenar() {
    	List<String> lista = new ArrayList<>();
    	
    	lista.add("Mitocode");
    	lista.add("Mito");
    	lista.add("Code");
    	
//    	Collections.sort(lista,new Comparator<String>(){
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//    		
//    	});
    	
    	
    	Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
    	
//    	for (String ls : lista) {
//    		System.out.println(ls);
//    	}
    	
    	//lista.forEach(x -> System.out.println(x));
    	lista.forEach(System.out::println);
    }
    
    public double multiplicar() {
    
//    	double z = 5;
//    	Operacion operacion = ( x,  y) -> {
//    		return z + (x * y);
//    	};
//    	
//    	return operacion.calcular(2, 3);
    	return 2.5;
    }
    
}
