package br.com.dicasdejava.fundamentos;

public class StringSeparadaPorVirgulaEmArray {

	public static void main(String[] args) {

		String stringDeNomes = "João, Carlos, José, Marcos, Maria, Julia, Joaquim, Ana";

		String[] arrayDeNomes = stringDeNomes.split(", ");

		System.out.println("Tamanho do array: "+arrayDeNomes.length);

		for(String nome : arrayDeNomes)
			System.out.println(nome);

	}

}