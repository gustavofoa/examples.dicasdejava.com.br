package br.com.dicasdejava.fundamentos;

public class IncrementoComMaisMaisOuComMais1ComandoComposto {

	public static void main(String[] args) {

		int i = 0;

		System.out.println("      i++ => " + (i++));
		System.out.println("        i => " + i);

		System.out.println("      ++i => " + (++i));
		System.out.println("        i => " + i);

		System.out.println("i = i + 1 => " + (i = i + 1));
		System.out.println("        i => " + i);

	}

}