package br.com.dicasdejava.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class PessoaIdadeComparator implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		return p1.idade - p2.idade;
	}
}

class PrincipalComparator {

	public static void main(String[] args) {

		List<Pessoa> lista = new ArrayList<>();
		lista.add(new Pessoa("Gustavo", 28));
		lista.add(new Pessoa("André", 30));
		lista.add(new Pessoa("Paulo", 20));
		lista.add(new Pessoa("Julia", 25));

		lista.sort(new PessoaIdadeComparator());

		lista.forEach(System.out::println);

	}

}

