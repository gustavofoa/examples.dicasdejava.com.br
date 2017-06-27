package br.com.dicasdejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralharList {

	public static void main(String[] args){

		List<String> lista = Arrays.asList("A", "B", "C", "D", "E", "F");

		//Antes de embaralhar
		System.out.println(lista);

		Collections.shuffle(lista);

		//Depois de embaralhar
		System.out.println(lista);

		Collections.shuffle(lista);

		//Depois de embaralhar novamente
		System.out.println(lista);

	}

}
