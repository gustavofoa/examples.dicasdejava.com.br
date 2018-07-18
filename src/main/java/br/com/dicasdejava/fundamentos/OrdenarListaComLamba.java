package br.com.dicasdejava.fundamentos;

import java.util.Arrays;
import java.util.List;

public class OrdenarListaComLamba {

	public static void main(String[] args) {

		List<String> nomes = Arrays.asList("Gustavo", "Daiana", "Wellington", "José", "Julia");

		nomes.sort((a, b) -> a.compareTo(b));

		for (String nome : nomes)
			System.out.println(nome);

	}

}