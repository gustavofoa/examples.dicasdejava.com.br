package br.com.dicasdejava.util;

import java.util.Arrays;

public class OrdenarArray {

	public static void main(String[] args) {
		String[] nomes = new String[]{"João", "Gustavo", "Maria", "José", "Ana"};

		System.out.println("Nomes não ordenados:");
		for(String nome : nomes)
			System.out.println(nome);
		System.out.println();

		Arrays.sort(nomes);

		System.out.println("Nomes ordenados:");
		for(String nome : nomes)
			System.out.println(nome);
		System.out.println();

		int[] numeros = new int[]{20,2, 8, 19, 100, 5, 1, 6, 13};

		System.out.println("Números não ordenados:");
		for(int numero : numeros)
			System.out.println(numero);
		System.out.println();

		Arrays.sort(numeros);

		System.out.println("Números ordenados:");
		for(int numero : numeros)
			System.out.println(numero);
		System.out.println();

	}
}
