package br.com.dicasdejava.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Pessoa implements Comparable<Pessoa> {
	String name;
	int idade;

	public Pessoa(String name, int idade) {
		this.name = name;
		this.idade = idade;
	}

	@Override
	public int compareTo(Pessoa outra) {
		return name.compareTo(outra.name);
	}

	@Override
	public String toString() {
		return "Pessoa{" + "name='" + name + '\'' + ", idade=" + idade + '}';
	}
}

class Principal {

	public static void main(String[] args) {

		List<Pessoa> lista = new ArrayList<>();
		lista.add(new Pessoa("Gustavo", 28));
		lista.add(new Pessoa("André", 30));
		lista.add(new Pessoa("Paulo", 20));
		lista.add(new Pessoa("Julia", 25));

		Collections.sort(lista);

		lista.forEach(System.out::println);

	}

}

